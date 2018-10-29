package com.andidz.authorithy.dao;

import com.andidz.authorithy.domain.RightResource;
import com.andidz.authorithy.mapper.RightResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class RightResourceDao {
    @Autowired
    private RightResourceMapper rightResourceMapper;

    public Set<String> findRightResorceByResourceId(List<Integer> id) {
        Set<String> set = new HashSet<>();
        for (int e : id
                ) {
            RightResource rightResource = new RightResource();
            rightResource = rightResourceMapper.selectByPrimaryKey(e);
            set.add(rightResource.getResourcename());
        }
        System.out.println("权限信息: " + set.toString());
        return set;
    }
}
