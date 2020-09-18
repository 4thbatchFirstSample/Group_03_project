package com.spring.boot.dto;

public class UserDto {
	private long Uid;
	private String userName;
	private String Password;
	
	public long getUid() {
		return Uid;
	}
	public void setUid(long uid) {
		Uid = uid;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
