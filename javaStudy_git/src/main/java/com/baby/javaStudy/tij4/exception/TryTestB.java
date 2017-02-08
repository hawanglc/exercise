package com.baby.javaStudy.tij4.exception;

public class TryTestB {
	public static void main(String[] args) throws ArithmeticException {
		System.out.println("===TryTestB===");
		for (int x = 0; x < 2; x++) {
			try {
				System.out.println("this is try block before exception");
				System.out.println(10 / 0);
				System.out.println("this is try block after exception");
			} catch (ArithmeticException e) {
				System.out.println("this is catch(ArithmeticException e) block");
			} catch (Exception e) {
				System.out.println("this is catch(Exception e) block");
			} finally {
				System.out.println("this is finally block");
			}

			System.out.println("this is other block afer finally block. x is " + x);
		}
	}

}
