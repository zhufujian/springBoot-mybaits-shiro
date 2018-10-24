package com.study.springBoot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.springBoot.entity.UserInfo;
import com.study.springBoot.mapper.UserInfoMapper;
import com.study.springBoot.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(username);
        List<UserInfo> userinfoList=userInfoMapper.multQuery(userInfo);
        if(userinfoList!=null&&userinfoList.size()>0){
        	return userinfoList.get(0);
        }
        return null;
    }
}