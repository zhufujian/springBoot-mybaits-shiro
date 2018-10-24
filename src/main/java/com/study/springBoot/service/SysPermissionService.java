package com.study.springBoot.service;

import java.util.List;

import com.study.springBoot.entity.SysPermission;


public interface SysPermissionService {
    public List<SysPermission> findByRid(int rid);
}