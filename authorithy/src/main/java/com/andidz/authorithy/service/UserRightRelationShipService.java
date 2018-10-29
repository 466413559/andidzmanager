package com.andidz.authorithy.service;

import java.util.List;

public interface UserRightRelationShipService {
    public List<Integer> findResourceIdByUserId(int userId);
}
