package com.baby.springStudy.action;

import com.baby.springStudy.impl.TimeBookInterface;

public class TestTimeBook {
	public static void main(String[] args) {
		TimeBookProxy timeBookProxy = new TimeBookProxy(new TimeBook());
		timeBookProxy.doAuditing("testTimeBook");
		
		System.out.println("-------------------");
		LogProxy logProxy = new LogProxy();
		TimeBookInterface timeBookInterface = (TimeBookInterface)logProxy.bind(new TimeBook());
		timeBookInterface.doAuditing("testTimeBook2");
	}
}
