package com.study.springBoot.mapper.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.springBoot.entity.SysPermission;
import com.study.springBoot.mapper.SysPermissionMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysPermissionMapperTest {

	@Autowired
	private SysPermissionMapper sySPermissionMapper;

	@Test
	public void testMultQuery() throws Exception {  
		SysPermission sysPermission=new SysPermission(); 
		sysPermission.setRole_id(1);
		List<SysPermission> list=sySPermissionMapper.multQuery(sysPermission);
		Assert.assertNotNull("返回为空", list);      
	} 

}