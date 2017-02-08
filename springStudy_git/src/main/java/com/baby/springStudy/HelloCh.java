package com.baby.springStudy;

public class HelloCh implements EchoMsg {
	
	private String msg = null;
	
	

	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public String sayHello() {
		// TODO Auto-generated method stub
		return "你好 "+ this.msg;
	}

}
