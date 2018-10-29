package com.andidz.authorithy.service.impl;

import com.andidz.authorithy.dao.RightResourceDao;
import com.andidz.authorithy.service.RightResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RightResourceServiceImpl implements RightResourceService {
    @Autowired
    private RightResourceDao rightResourceDao;
    @Override
    public Set<String> findRightResorceByResourceId(List<Integer> id) {
        return rightResourceDao.findRightResorceByResourceId(id);
    }
}
