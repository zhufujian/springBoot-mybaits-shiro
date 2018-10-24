package com.study.springBoot.service;

import java.util.List;

import com.study.springBoot.entity.SysRole;


public interface SysRoleService {
    public List<SysRole> findByUserId(int uid);
}