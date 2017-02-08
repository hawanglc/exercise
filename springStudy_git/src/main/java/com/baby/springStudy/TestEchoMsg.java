package com.baby.springStudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestEchoMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext actx = new FileSystemXmlApplicationContext("/src/main/java/com/baby/springStudy/echoMsgConfig.xml");
		EchoMsg echoMsg = (EchoMsg)actx.getBean("EchoMsg");
		System.out.println(echoMsg.sayHello());
	}

}
