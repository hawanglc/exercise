package com.baby.springStudy.action;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.baby.springStudy.impl.TimeBookInterface;

public class TimeBookProxy {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private TimeBookInterface timeBookInterface;
	
	public TimeBookProxy(TimeBookInterface timeBookInterface){
		this.timeBookInterface = timeBookInterface;
	}
	
	public void doAuditing(String name){
		logger.log(Level.INFO, "test 1............" + name);
		timeBookInterface.doAuditing(name);
		logger.log(Level.INFO, "Test 2............" + name);
	}
}
