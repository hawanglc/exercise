package com.baby.springStudy;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello3 implements InitializingBean, DisposableBean {
	private String msg = null;
	private Date date = null;

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

	public void afterPropertiesSet() throws Exception {
		this.msg = "init by afterPropertiesSet()";
		this.date = new Date();
		
	}

	public void destroy() throws Exception {
		this.msg = "";
		this.date = null;
		System.out.println("您销毁了 "+this.msg + " and " + this.date);
		
	}

	
}
