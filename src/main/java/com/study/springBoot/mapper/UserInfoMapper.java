package com.study.springBoot.mapper;

import java.util.List;

import com.study.springBoot.entity.UserInfo;

public interface UserInfoMapper {
	
	List<UserInfo> multQuery(UserInfo userInfo);
}