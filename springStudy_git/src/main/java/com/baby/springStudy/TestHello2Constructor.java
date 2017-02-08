package com.baby.springStudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHello2Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext actx = new FileSystemXmlApplicationContext("/src/main/java/com/baby/springStudy/helloConfigConstructor.xml");
		Hello hello = (Hello)actx.getBean("Hello");
		System.out.println(hello.getMsg());
	}

}
