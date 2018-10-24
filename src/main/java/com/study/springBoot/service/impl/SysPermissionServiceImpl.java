package com.study.springBoot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.springBoot.entity.SysPermission;
import com.study.springBoot.mapper.SysPermissionMapper;
import com.study.springBoot.service.SysPermissionService;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Resource
    private SysPermissionMapper sysPermissionMapper;
    @Override
    public List<SysPermission> findByRid(int rid) {
        System.out.println("sysPermissionMapper.findByRid()");
        SysPermission sysPermission=new SysPermission();
        sysPermission.setRole_id(rid);
        List<SysPermission> userinfoList=sysPermissionMapper.multQuery(sysPermission);
        return userinfoList;
    }
}