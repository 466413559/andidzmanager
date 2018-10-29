package com.andidz.authorithy.dao;

import com.andidz.authorithy.domain.User;
import com.andidz.authorithy.domain.UserExample;
import com.andidz.authorithy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public User findUserByUserName(String userName){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<User> list = userMapper.selectByExample(userExample);
        if(list == null || list.isEmpty()){
            return null;
        }
        return list.get(0);
    }


}
