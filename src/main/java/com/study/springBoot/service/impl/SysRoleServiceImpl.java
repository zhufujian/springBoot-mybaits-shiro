package com.study.springBoot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.springBoot.entity.SysRole;
import com.study.springBoot.mapper.SysRoleMapper;
import com.study.springBoot.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Override
    public List<SysRole>  findByUserId(int uid) {
        System.out.println("SysRoleServiceImpl.findByUserId()");
        SysRole sysRole=new SysRole();
        sysRole.setUid(uid);
        List<SysRole> sysRoleList=sysRoleMapper.multQuery(sysRole);
       
        return sysRoleList;
    }
}