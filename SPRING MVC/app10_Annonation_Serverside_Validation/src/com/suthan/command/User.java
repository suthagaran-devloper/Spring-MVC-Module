package com.suthan.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	//@NotEmpty
	private String uname;
	
	//@NotEmpty(message="user password is required")
	//@Size(min=6, max=10, message="user password must be 6 -10 chaacter")
	private String upwd;
	
	//@NotNull(message="user age is required")
	//@Range(min=20, max=40, message="user age  range 20-40")
	private int uage;
	
	
	//@NotNull(message="user Date of birth is required")
	//@DateTimeFormat(pattern="dd/MM/yyyy")
	//@Past(message="user Date of birth must be pastdate")
	private String udob;
	
	
	//@NotEmpty(message="user email is required")
	//@Email
	private String uemail;
	
	//@NotEmpty(message="user mobile is required")
	//@Pattern(regexp="0044-[0-9]-{10}",message="user mobile 0044 and 10digitforma")
	private String umobile;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	
	
	public String getUdob() {
		return udob;
	}
	public void setUdob(String udob) {
		this.udob = udob;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	
	
}
