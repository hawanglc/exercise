package com.baby.springStudy;

import java.util.Date;

public class Hello {
	private String msg = null;
	private Date date = null;
	
	public Hello() {
		// TODO Auto-generated constructor stub
	}
	
	Hello(String msg){
		this.msg = msg;
	}

	public String getMsg() {
		return msg +" | " + this;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
