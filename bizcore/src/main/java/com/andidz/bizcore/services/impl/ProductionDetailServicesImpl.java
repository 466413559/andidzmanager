package com.andidz.bizcore.services.impl;

import com.andidz.bizcore.dao.ProductionCompletedDetailDao;
import com.andidz.bizcore.domain.ProductionCompletedDetail;
import com.andidz.bizcore.domain.ProductionOrder;
import com.andidz.bizcore.domain.ProductionPlan;
import com.andidz.bizcore.domain.ProductionTask;
import com.andidz.bizcore.domain.condition.ProductionCompletedDetailCondition;
import com.andidz.bizcore.domain.condition.ProductionOrderCondition;
import com.andidz.bizcore.services.ProductionDetailServices;
import com.andidz.bizcore.services.ProductionOrderServices;
import com.andidz.bizcore.services.ProductionPlanServices;
import com.andidz.bizcore.services.ProductionTaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductionDetailServicesImpl implements ProductionDetailServices {

    @Autowired
    private ProductionCompletedDetailDao productionCompletedDetailDao;
    @Autowired
    private ProductionPlanServices productionPlanServices;
    @Autowired
    private ProductionTaskServices productionTaskServices;
    @Autowired
    private ProductionOrderServices productionOrderServices;

    @Override
    public List<ProductionCompletedDetail> queryDetailByOrderNumb(String orderNumb, Integer type ,Integer start, Integer pageSize) {
        List<ProductionCompletedDetail> result = new ArrayList<>();
        if( null == orderNumb)return result;
        ProductionCompletedDetailCondition condition = new ProductionCompletedDetailCondition();
        condition.setOrdernumb(orderNumb);
        if( null != type){
            condition.setType(type);
        }
        if(null != start && null!= pageSize){
            condition.setStart(start);
            condition.setPageSize(pageSize);
        }
        result = productionCompletedDetailDao.getDetail(condition);
        return result;
    }

    @Override
    public List<ProductionCompletedDetail> queryDetailByTaskId(Integer taskId, Integer type,Integer start, Integer pageSize) {
        List<ProductionCompletedDetail> result = new ArrayList<>();
        if( null == taskId)return result;
        ProductionCompletedDetailCondition condition = new ProductionCompletedDetailCondition();
        condition.setTaskId(taskId);
        if( null != type){
            condition.setType(type);
        }
        if(null != start && null!= pageSize){
            condition.setStart(start);
            condition.setPageSize(pageSize);
        }
        result = productionCompletedDetailDao.getDetail(condition);
        return result;
    }

    @Override
    public List<ProductionCompletedDetail> queryDetailByPlanId(Integer planId, Integer type,Integer start, Integer pageSize) {
        List<ProductionCompletedDetail> result = new ArrayList<>();
        if( null == planId)return result;
        ProductionCompletedDetailCondition condition = new ProductionCompletedDetailCondition();
        condition.setPlanid(planId);
        if( null != type){
            condition.setType(type);
        }
        if(null != start && null!= pageSize){
            condition.setStart(start);
            condition.setPageSize(pageSize);
        }
        result = productionCompletedDetailDao.getDetail(condition);
        return result;
    }

    @Override
    public ProductionCompletedDetail queryDetailByDetailId(Integer id) {
        if(null == id)return null;
        return productionCompletedDetailDao.getDetailById(id);
    }

    @Override
    @Transactional
    public Boolean submitPlanDetail(Integer planId, Integer completedCount, Integer qualifiedCount, String name) throws Exception {
        if(qualifiedCount> completedCount) return false;
        ProductionPlan plan = productionPlanServices.getPlanById(planId);
        ProductionTask task = productionTaskServices.queryTaskById(plan.getTaskid());
        ProductionOrder order = productionOrderServices.getOrderByOrderNumb(plan.getOrdernumb());
        if(null == plan || null == task || null == order)return false;
        ProductionCompletedDetail detail = new ProductionCompletedDetail();
        detail.setType(0);
        detail.setPlanid(planId);
        detail.setTaskid(task.getTaskid());
        detail.setCompletedProduce(completedCount);
        detail.setQualifiedProduce(qualifiedCount);
        detail.setOrdernumb(order.getOrdernumb());
        detail.setCreatetime(new Date());
        detail.setUpdatetime(new Date());
        detail.setOperator(name);
        if(!productionCompletedDetailDao.insertProductionCompletedDetail(detail))return false;
        //同步更新plan
        plan.setUpdatetime(new Date());
        plan.setCompletedproduce(plan.getCompletedproduce()+completedCount);
        plan.setQualifiedproduce(plan.getQualifiedproduce()+qualifiedCount);
        if(!productionPlanServices.updatePlan(plan))throw new Exception();;
        //同步更新task
        task.setTotalproduce(task.getTotalproduce()+completedCount);
        task.setTotalqualify(task.getTotalqualify()+qualifiedCount);
        if(!productionTaskServices.updateProdcutionTask(task))throw new Exception();
        //若为入库操作则同步更新order
        //TODO
        if(task.getWorkshopnumb() == 9){

        }
        return true;
    }

    @Override
    @Transactional
    public Boolean submitDeliverDetail(Integer taskId, Integer deliverCount,String name) throws Exception {
        ProductionTask task = productionTaskServices.queryTaskById(taskId);
        if(task == null)return false;
        ProductionCompletedDetail detail = new ProductionCompletedDetail();
        detail.setType(1);
        detail.setCompletedProduce(deliverCount);
        detail.setQualifiedProduce(deliverCount);
        detail.setOrdernumb(task.getOrdernumb());
        detail.setTaskid(taskId);
        detail.setOperator(name);
        detail.setCreatetime(new Date());
        if(!productionCompletedDetailDao.insertProductionCompletedDetail(detail))return false;
        //同步更新task交接数据
        task.setTotaldeliver(task.getTotaldeliver()+deliverCount);
        if(!productionTaskServices.updateProdcutionTask(task))throw new Exception();
        //入库操作的同步更新待定
        return true;
    }

    @Override
    public Boolean updatePlanDetail(Integer id, Integer completedCount, Integer qualifiedCount, String name) throws Exception {
        ProductionCompletedDetail detail = queryDetailByDetailId(id);
        if(null == detail)return false;
        ProductionPlan plan = productionPlanServices.getPlanById(detail.getPlanid());
        ProductionTask task = productionTaskServices.queryTaskById(detail.getTaskid());
        ProductionOrder order = productionOrderServices.getOrderByOrderNumb(detail.getOrdernumb());
        if(null == plan || null == task || null == order)return false;
        Integer updateCompletedCount = completedCount-detail.getCompletedProduce();
        Integer updateQualifiedCount = qualifiedCount-detail.getQualifiedProduce();
        detail.setCompletedProduce(completedCount);
        detail.setQualifiedProduce(qualifiedCount);
        detail.setOperator(name);
        detail.setUpdatetime(new Date());
        if(!productionCompletedDetailDao.updateProductionCompleteDetailByPrimaryKey(detail))return false;
        //同步更新plan
        plan.setUpdatetime(new Date());
        plan.setCompletedproduce(plan.getCompletedproduce()+updateCompletedCount);
        plan.setQualifiedproduce(plan.getQualifiedproduce()+updateQualifiedCount);
        if(!productionPlanServices.updatePlan(plan))throw new Exception();
        //同步更新task
        task.setTotalproduce(task.getTotalproduce()+updateCompletedCount);
        task.setTotalqualify(task.getTotalqualify()+updateQualifiedCount);
        if(!productionTaskServices.updateProdcutionTask(task))throw new Exception();
        //若为入库操作则同步更新order
        //TODO
        if(task.getWorkshopnumb() == 9){

        }
        return true;
    }

    @Override
    public Boolean updateDeliverDetail(Integer id, Integer deliverCount,String name) throws Exception {
        ProductionCompletedDetail detail = queryDetailByDetailId(id);
        if(null == detail)return false;
        ProductionTask task = productionTaskServices.queryTaskById(detail.getTaskid());
        if(null == task) return false;
        Integer updateDeliverCount = deliverCount-detail.getCompletedProduce();
        detail.setCompletedProduce(deliverCount);
        detail.setQualifiedProduce(deliverCount);
        detail.setOperator(name);
        detail.setUpdatetime(new Date());
        if(!productionCompletedDetailDao.updateProductionCompleteDetailByPrimaryKey(detail))return false;
        //同步更新task交接数据
        task.setTotaldeliver(task.getTotaldeliver()+updateDeliverCount);
        if(!productionTaskServices.updateProdcutionTask(task))throw new Exception();
        //入库操作的同步更新待定
        return true;
    }
}
