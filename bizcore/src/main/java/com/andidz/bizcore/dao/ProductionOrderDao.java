package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductionOrder;
import com.andidz.bizcore.domain.ProductionOrderExample;
import com.andidz.bizcore.domain.condition.ProductionOrderCondition;
import com.andidz.bizcore.mapper.ProductionOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class ProductionOrderDao {
    @Autowired
    private ProductionOrderMapper productionOrderMapper;

    public List<ProductionOrder> getProductionOrder(Integer productionType,Integer start, Integer pagesize){
        List<ProductionOrder> result = new ArrayList<>();
        ProductionOrderExample example = new ProductionOrderExample();
        ProductionOrderExample.Criteria criteria = example.createCriteria();
        if(null!= productionType){
            criteria.andProductiontypeEqualTo(productionType);
        }
        if(null!=start&&null!=pagesize) {
            example.setStart(start);
            example.setPageSize(pagesize);
        }
        result = productionOrderMapper.selectByExample(example);
        return result;
    }

    public List<ProductionOrder> getProductionOrderBySearchCondition(ProductionOrderCondition condition){
        List<ProductionOrder> result = new ArrayList<>();
        ProductionOrderExample example = new ProductionOrderExample();
        ProductionOrderExample.Criteria criteria = example.createCriteria();
        if(null == condition){
            return result;
        }

        if(null!= condition.getOrdernumb()){
            criteria.andOrdernumbLike(condition.getOrdernumb()+"%");
        }
        if(null!=condition.getProductiontype()){
            criteria.andProductiontypeEqualTo(condition.getProductiontype());
        }
        if(null!= condition.getProductnumb()){
            criteria.andProductnumbEqualTo(condition.getProductnumb());
        }
        if(null!= condition.getCreatetime()){
            Date today = condition.getCreatetime();
            today.setHours(0);
            today.setMinutes(0);
            today.setSeconds(0);
            criteria.andCreatetimeBetween(today,new Date(today.getTime()+24*60*60*1000));
        }

        if(null!= condition.getExpctstarttime()){
            Date today = condition.getExpctstarttime();
            today.setHours(0);
            today.setMinutes(0);
            today.setSeconds(0);
            criteria.andExpctstarttimeBetween(today,new Date(today.getTime()+24*60*60*1000));
        }

        if(null!= condition.getExpctendtime()){
            Date today = condition.getExpctendtime();
            today.setHours(0);
            today.setMinutes(0);
            today.setSeconds(0);
            criteria.andExpctendtimeBetween(today,new Date(today.getTime()+24*60*60*1000));
        }
        if(null != condition.getStatus()){
            criteria.andStatusEqualTo(condition.getStatus());
        }
        if (null != condition.getStart() && null != condition.getPageSize()) {
            example.setStart(condition.getStart());
            example.setPageSize(condition.getPageSize());
        }
        return result;
    }

    public Boolean insertProductionOrder(ProductionOrder productionOrder){
        return productionOrderMapper.insert(productionOrder)>0;
    }

    public Boolean updateProductionOrder(ProductionOrder productionOrder){
        if(null == productionOrder || null == productionOrder.getId()){
            return false;
        }
        return productionOrderMapper.updateByPrimaryKey(productionOrder)>0;
    }
}
