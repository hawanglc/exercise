package com.baby.javaStudy;

import java.util.Date;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello, i love java! today is [" + new Date() + "]");

		//使用第三方库中的方法
		String str1 = "address";
		System.out.println("src string is [" + str1 + "] and dest string is [" + StringUtils.capitalize(str1) + "]");
		
		Date now = new Date();
		System.out.println("now is " + now);
		System.out.println("timestamp is " + now.getTime());
		Timestamp timestamp = new Timestamp(new Date().getTime());
		System.out.println("new timestamp is " + timestamp);
		System.out.println("new timestamp to number is " + timestamp.getTime());

		System.out.println(now.getClass());

		Vector<String> v = new Vector<String>();
		v.addElement("wanglc");
		v.addElement("baby");
		System.out.println(v);
		for (Enumeration<String> e = v.elements(); e.hasMoreElements();)
			System.out.println(e.nextElement());
		
		Map<Integer,String> map_itos = new HashMap<Integer,String>();
		map_itos.put(1,"wanglc1");
		map_itos.put(2,"wanglc2");
		
		for (Entry<Integer, String> entry: map_itos.entrySet()) {
			
			System.out.println(entry);
		}
		
		System.out.println(map_itos);
	}
}
