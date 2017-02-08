package com.baby.springStudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHello3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext actx = new FileSystemXmlApplicationContext("/src/main/java/com/baby/springStudy/helloConfig2.xml");
		Hello2 hello2 = (Hello2)actx.getBean("Hello2");
		System.out.println(hello2.getDate() + " | " + hello2.getMsg());
		System.out.println(actx);
	}

}
