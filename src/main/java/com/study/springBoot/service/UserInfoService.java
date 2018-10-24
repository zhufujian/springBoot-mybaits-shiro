package com.study.springBoot.service;

import com.study.springBoot.entity.UserInfo;


public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}