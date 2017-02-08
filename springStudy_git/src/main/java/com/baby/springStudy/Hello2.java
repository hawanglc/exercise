package com.baby.springStudy;

import java.util.Date;

public class Hello2 {
	private String msg = null;
	private Date date = null;
	
	public void init() {
		this.msg = "hello2 by init()";
		this.date = new Date();
	}
	
	public void cleanup(){
		this.msg = "";
		this.date = null;
		System.out.println("您销毁了 "+this.msg + " and " + this.date);
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
