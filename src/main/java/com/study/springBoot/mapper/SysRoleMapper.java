package com.study.springBoot.mapper;

import java.util.List;

import com.study.springBoot.entity.SysRole;

public interface SysRoleMapper {
	
	List<SysRole> multQuery(SysRole sysRole);
}