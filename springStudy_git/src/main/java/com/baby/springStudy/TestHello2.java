package com.baby.springStudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext actx = new FileSystemXmlApplicationContext("/src/main/java/com/baby/springStudy/helloConfig.xml");
		Hello hello = (Hello)actx.getBean("Hello");
		System.out.println(hello.getDate() + " | " + hello.getMsg());
		System.out.println(actx);
		
		ApplicationContext actx2 = new FileSystemXmlApplicationContext("/src/main/java/com/baby/springStudy/helloConfig.xml");
		Hello hello2 = (Hello)actx2.getBean("Hello");
		System.out.println(hello.getDate() + " | " + hello.getMsg());
		System.out.println(actx2);
	}

}
