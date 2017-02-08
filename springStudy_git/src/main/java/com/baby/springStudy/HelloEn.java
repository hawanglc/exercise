package com.baby.springStudy;

public class HelloEn implements EchoMsg {
	private String msg = null;
	
	

	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello " + this.msg;
	}

}
