package com.study.springBoot.mapper.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.springBoot.entity.SysRole;
import com.study.springBoot.mapper.SysRoleMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysRoleMapperTest {

	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Test
	public void testMultQuery() throws Exception {  
		SysRole sysRole=new SysRole(); 
		sysRole.setUid(1); 
		List<SysRole> list=sysRoleMapper.multQuery(sysRole);

		Assert.assertNotNull("返回为空", list);     
	}

}