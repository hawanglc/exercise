package com.baby.javaStudy.tij4.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A {
	public void foo(String name) {
		System.out.println("Hello, " + name);
	}
}

public class TestClassLoad {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException  {
		try{
			Class<?> clz = Class.forName("com.baby.javaStudy.tij4.reflection.A");
			Object o = clz.newInstance();
			Method m = clz.getMethod("foo", String.class);
			for (int i = 0; i < 10; i++) {
				m.invoke(o, Integer.toString(i));
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(NoSuchMethodException e){
			e.printStackTrace();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
	}
}
