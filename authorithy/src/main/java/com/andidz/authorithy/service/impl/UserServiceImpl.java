package com.andidz.authorithy.service.impl;

import com.andidz.authorithy.dao.UserDao;
import com.andidz.authorithy.domain.User;
import com.andidz.authorithy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public User findUserByUserName(String username) {
        return userDao.findUserByUserName(username);
    }
}
