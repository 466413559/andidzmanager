package com.andidz.authorithy.dao;

import com.andidz.authorithy.domain.UserRightRelationship;
import com.andidz.authorithy.domain.UserRightRelationshipExample;
import com.andidz.authorithy.mapper.UserRightRelationshipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRightRelationshipDao {

    @Autowired
    private UserRightRelationshipMapper userRightRelationshipMapper;

    public List<Integer> findResourceIdByUserId(int userId){
        UserRightRelationshipExample userRightRelationshipExample =
                new UserRightRelationshipExample();
        UserRightRelationshipExample.Criteria criteria = userRightRelationshipExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<UserRightRelationship> list = userRightRelationshipMapper.selectByExample(userRightRelationshipExample);
        List<Integer> lis1 = new ArrayList<>();
        if(list.isEmpty()){
            System.out.println("没有权限信息");
            return null;
        }else{
            for (UserRightRelationship u :
                    list) {
                lis1.add(u.getResourceid());
            }
            System.out.println("权限ID:" + lis1.toString());
        return lis1;
       }
    }
}
