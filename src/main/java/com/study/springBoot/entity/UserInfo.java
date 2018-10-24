package com.study.springBoot.entity;

import java.io.Serializable;
import java.util.List;

public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int uid;
	private String name;
	private String password;
	private String salt;
	private String state;
	private String username;
	
	private List<SysPermission> permissions;
	private List<SysRole> sysRoles;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<SysPermission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<SysPermission> permissions) {
		this.permissions = permissions;
	}
	public List<SysRole> getSysRoles() {
		return sysRoles;
	}
	public void setSysRoles(List<SysRole> sysRoles) {
		this.sysRoles = sysRoles;
	}
}
