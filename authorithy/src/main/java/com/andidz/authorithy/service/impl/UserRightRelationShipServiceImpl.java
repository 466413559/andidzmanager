package com.andidz.authorithy.service.impl;

import com.andidz.authorithy.dao.UserRightRelationshipDao;
import com.andidz.authorithy.service.UserRightRelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRightRelationShipServiceImpl implements UserRightRelationShipService {

    @Autowired
    private UserRightRelationshipDao userRightRelationshipDao;
    @Override
    public List<Integer> findResourceIdByUserId(int userId) {
        return userRightRelationshipDao.findResourceIdByUserId(userId);
    }
}
