package com.baby.javaStudy.tij4.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class SimpleCollection {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++){
			collection.add(i);
		}
		
		for(Integer integer : collection){
			System.out.println(integer);
		}
		
		System.out.println("=============");
		System.out.println(collection);
		
		Iterator<Integer> iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		java.util.List<Integer> list = new ArrayList<Integer>(10);
		System.out.println(list);
		System.out.println(list.size());
		for(int jj = 0; jj < 10; jj++){
			list.add(jj);
		}
		System.out.println(list);
		System.out.println(list.size());
		
		ListIterator<Integer> listIterator = list.listIterator();
		//listIterator.next();
		System.out.println(listIterator);
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		if (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println(listIterator.previous());
		

	}

}

