package com.andidz.authorithy.service;

import com.andidz.authorithy.domain.User;

public interface UserService {
    public User findUserByUserName(String username);
}
