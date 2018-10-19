package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductionCompletedDetail;
import com.andidz.bizcore.domain.ProductionCompletedDetailExample;
import com.andidz.bizcore.domain.condition.ProductionCompletedDetailCondition;
import com.andidz.bizcore.mapper.ProductionCompletedDetailMapper;
import com.andidz.bizcore.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class ProductionCompletedDetailDao {
    @Autowired
    private ProductionCompletedDetailMapper productionCompletedDetailMapper;

    public Boolean insertProductionCompletedDetail(ProductionCompletedDetail detail) {
        return productionCompletedDetailMapper.insert(detail) > 0;
    }

    /**
     * 按条件查询
     * @return
     */
    public List<ProductionCompletedDetail> getDetail(ProductionCompletedDetailCondition condition) {
        ProductionCompletedDetailExample example = new ProductionCompletedDetailExample();
        ProductionCompletedDetailExample.Criteria criteria = example.createCriteria();
        if(null == condition){
            return new ArrayList<ProductionCompletedDetail>();
        }
        if (null != condition.getOrdernumb()) {
            criteria.andOrdernumbNotEqualTo(condition.getOrdernumb());
        }

        if (null != condition.getPlanid()) {
            criteria.andPlanidEqualTo(condition.getPlanid());
        }

        if (null != condition.getDate()) {
            Date nextDay = DateUtils.getNextDate(condition.getDate());
            criteria.andCreatetimeBetween(condition.getDate(), nextDay);
        }

        if (null != condition.getType()) {
            criteria.andTypeEqualTo(condition.getType());
        }

        if (null != condition.getStatus()) {
            criteria.andStatusEqualTo(condition.getStatus());
        }

        if (null != condition.getOperator()) {
            criteria.andOperatorEqualTo(condition.getOperator());
        }

        if (null != condition.getStart() && null != condition.getPageSize()) {
            example.setStart(condition.getStart());
            example.setPageSize(condition.getPageSize());
        }
        return productionCompletedDetailMapper.selectByExample(example);
    }

    public  Boolean updateProductionCompleteDetailByPrimaryKey(ProductionCompletedDetail detail){
        return productionCompletedDetailMapper.updateByPrimaryKey(detail)>0;
    }
}
