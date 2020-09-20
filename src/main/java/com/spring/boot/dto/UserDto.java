package com.spring.boot.dto;

public class UserDto {
	private long Uid;
	private String UserName;
	private String Password;
	
	public long getUid() {
		return Uid;
	}
	public void setUid(long uid) {
		Uid = uid;
	}
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
