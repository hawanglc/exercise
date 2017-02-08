package com.baby.javaStudy.tij4.exception;

public class TryTestA {
	public static void main(String[] args){
		System.out.println("===TryTestA===");
		for(int x = 0; x < 2; x++){
			try{
				System.out.println("this is try block before exception");
				System.out.println(10/0);
				System.out.println("this is try block after exception");
			}finally{
				System.out.println("this is finally block");
			}
			
			System.out.println("this is other block afer finally block. x is "+x);
		}
	}

}
