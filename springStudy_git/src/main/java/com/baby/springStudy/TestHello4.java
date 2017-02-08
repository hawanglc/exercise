package com.baby.springStudy;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHello4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext actx = new FileSystemXmlApplicationContext("/src/main/java/com/baby/springStudy/helloConfig3.xml");
		Hello3 hello3 = (Hello3)actx.getBean("Hello3");
		System.out.println(hello3.getDate() + " | " + hello3.getMsg());
		System.out.println(actx);
		
		System.out.println("use BeanWrapper");
		Hello3 hello32 = new Hello3();
		BeanWrapper beanWrapper = new BeanWrapperImpl(hello32);
		beanWrapper.setPropertyValue("msg", "hello32");
		System.out.println(beanWrapper.getPropertyValue("msg"));
		
		/*
		 System.out.println("use Bean factory");
		InputStream inputStream = new FileInputStream("/src/main/java/com/baby/springStudy/helloConfig3.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(inputStream);
		Hello3 hello33 = (Hello3) xmlBeanFactory.getBean("Hello3");
		System.out.println(hello33.getMsg());
		 */
		
		
	}

}
