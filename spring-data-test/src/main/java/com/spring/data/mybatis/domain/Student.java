package com.spring.data.mybatis.domain;

import java.util.Date;
/**
 * 
 * @author zwl
 *
 * 2016年9月9日 下午4:55:09
 */
public class Student {

	private Integer studId;
	private String name;
	private String email;
	private Date dob;
	
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
