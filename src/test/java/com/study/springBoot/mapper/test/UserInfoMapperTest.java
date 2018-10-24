package com.study.springBoot.mapper.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.springBoot.entity.UserInfo;
import com.study.springBoot.mapper.UserInfoMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoMapperTest {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Test
	public void testMultQuery() throws Exception { 
		UserInfo userInfo=new UserInfo(); 
		userInfo.setUsername("admin");  
		List<UserInfo> list=userInfoMapper.multQuery(userInfo);

		Assert.assertNotNull("返回为空", list);    
	}

}