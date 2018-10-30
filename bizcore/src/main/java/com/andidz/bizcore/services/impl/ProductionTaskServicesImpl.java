package com.andidz.bizcore.services.impl;

import com.andidz.bizcore.dao.ProductionTaskDao;
import com.andidz.bizcore.domain.ProductionOrder;
import com.andidz.bizcore.domain.ProductionTask;
import com.andidz.bizcore.domain.WorkshopArt;
import com.andidz.bizcore.mapper.ProductionTaskMapper;
import com.andidz.bizcore.services.ProductServices;
import com.andidz.bizcore.services.ProductionTaskServices;
import com.andidz.bizcore.services.WorkshopArtServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProductionTaskServicesImpl implements ProductionTaskServices {

    @Autowired
    private WorkshopArtServices workshopArtServices;

    @Autowired
    private ProductServices productServices;

    @Autowired
    private ProductionTaskDao productionTaskDao;

    @Override
    @Transactional
    public Boolean createProductionTaskByOrder(ProductionOrder order) throws Exception{
        if(null==order || null == order.getProductnumb() || null == order.getOrdernumb())return false;
        String productnumb = order.getProductnumb();
        List<WorkshopArt> workshopArts = workshopArtServices.queryWorkshopArtByProductNumb(productnumb);
        for (int i = 0; i < workshopArts.size(); i++) {
            ProductionTask task = new ProductionTask();
            task.setOrdernumb(order.getOrdernumb());
            task.setPlanningtotalproduce(order.getPlanningproducecount());
            task.setWorkshopnumb(workshopArts.get(i).getWorkshopnumb());
            task.setStatus(0);
            task.setCreatetime(new Date());
            createProdctionTask(task);
        }
        return true;
    }

    @Override
    public Boolean createProdctionTask(ProductionTask task) {
        return productionTaskDao.insertProductionTask(task);
    }

    @Override
    public Boolean updateProdcutionTask(ProductionTask task) {
        if(null == task || null == task.getTaskid())return false;
        return productionTaskDao.updateProduction(task);
    }

    @Override
    public List<ProductionTask> queryTaskByOrder(String order, Integer status, Integer start, Integer pageSize) {
        return null;
    }
}
