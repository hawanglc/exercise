package com.baby.springStudy.action;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogProxy implements InvocationHandler {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Object delegate;
	
	public Object bind(Object delegate){
		this.delegate = delegate;
		return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		try {
			logger.log(Level.INFO, "test 1............");
			result = method.invoke(delegate, args);
			logger.log(Level.INFO, "Test 2............");
		} catch (Exception e) {
			// TODO: handle exception
			logger.log(Level.INFO, e.toString());
		}
		return null;
	}

}
