package com.study.springBoot.entity;

import java.io.Serializable;

public class SysRole implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;//
	private byte available;
	private String description;
	private String role;
	private int uid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte getAvailable() {
		return available;
	}
	public void setAvailable(byte available) {
		this.available = available;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
}
