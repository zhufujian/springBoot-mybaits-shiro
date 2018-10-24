package com.study.springBoot.mapper;

import java.util.List;

import com.study.springBoot.entity.SysPermission;

public interface SysPermissionMapper {
	
	List<SysPermission> multQuery(SysPermission sysPermission);
}