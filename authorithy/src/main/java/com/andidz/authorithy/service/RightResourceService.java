package com.andidz.authorithy.service;

import java.util.List;
import java.util.Set;

public interface RightResourceService {
    public Set<String> findRightResorceByResourceId(List<Integer> id);
}
