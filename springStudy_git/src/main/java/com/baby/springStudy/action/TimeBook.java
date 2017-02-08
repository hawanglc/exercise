package com.baby.springStudy.action;

import com.baby.springStudy.impl.TimeBookInterface;

public class TimeBook implements TimeBookInterface {

	public void doAuditing(String name) {
		// TODO Auto-generated method stub
		System.out.println("public void doAuditing(String name)\t" + this.getClass().getName());
	}

}
