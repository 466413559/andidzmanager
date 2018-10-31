package com.andidz.bizcore.services.impl;

import com.andidz.bizcore.dao.ProductArtRelationshipDao;
import com.andidz.bizcore.dao.ProductionOrderDao;
import com.andidz.bizcore.dao.WorkshopArtDao;
import com.andidz.bizcore.domain.*;
import com.andidz.bizcore.domain.condition.ProductionOrderCondition;
import com.andidz.bizcore.services.ProductServices;
import com.andidz.bizcore.services.ProductionOrderServices;
import com.andidz.bizcore.services.ProductionTaskServices;
import com.andidz.bizcore.services.WorkshopArtServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProductionOrderServicesImpl implements ProductionOrderServices {

    @Autowired
    private ProductionOrderDao productionOrderDao;

    @Autowired
    private ProductionTaskServices productionTaskServices;

    @Autowired
    private WorkshopArtServices workshopArtServices;

    @Autowired
    private ProductServices productServices;

    @Override
    public Integer getOrderCount() {
        return productionOrderDao.getProductionOrderCount();
    }

    @Override
    public ProductionOrder getOrderById(Integer id) {
        return productionOrderDao.getOrderById(id);
    }

    @Override
    public ProductionOrder getOrderByOrderNumb(String orderNumb) {
        ProductionOrderCondition condition = new ProductionOrderCondition();
        condition.setOrdernumb(orderNumb);
        List<ProductionOrder> result = productionOrderDao.getProductionOrderBySearchCondition(condition);
        if(null == result || result.isEmpty())return null;
        return result.get(0);
    }

    @Override
    public List<ProductionOrder> queryOrderByTypeId(Integer id, Integer start, Integer pageSize) {
        if(null == id){
            return null;
        }
        return productionOrderDao.getProductionOrder(id,start,pageSize);
    }

    @Override
    @Transactional
    public Boolean createProductionOrder(ProductionOrder order, List<Integer> shopNumbs) throws Exception {
        if(null == order || null == order.getProductnumb())return false;
        if(null == shopNumbs || shopNumbs.isEmpty()){
            String productnumb = order.getProductnumb();
            List<WorkshopArt> workshopArts = workshopArtServices.queryWorkshopArtByProductNumb(productnumb);
            if(null == workshopArts || workshopArts.isEmpty())return false;

            for (int i = 0; i < workshopArts.size(); i++) {
                shopNumbs.add(workshopArts.get(i).getWorkshopnumb());
            }
        }
        //创建order
        /**
         * 生产ordernumb
         */
        String orderNumb = null;
        order.setOrdernumb(orderNumb);
        if(!productionOrderDao.insertProductionOrder(order))return false;
        //创建task
        for (int i = 0; i < shopNumbs.size(); i++) {
            ProductionTask task = new ProductionTask();
            task.setOrdernumb(orderNumb);
            task.setPlanningtotalproduce(order.getPlanningproducecount());
            task.setWorkshopnumb(shopNumbs.get(i));
            task.setStatus(0);
            task.setCreatetime(new Date());
            if(!productionTaskServices.createProdctionTask(task))throw new Exception();
        }
        return true;
    }

    @Override
    public Boolean recreateProductionOrder(ProductionOrder order, Integer numb) {
        return null;
    }

    @Override
    public Boolean updateProductionOrder(ProductionOrder order) {

        if(null == order || null == order.getId())return false;
        order.setUpdatetime(new Date());
        return productionOrderDao.updateProductionOrder(order);
    }
}
