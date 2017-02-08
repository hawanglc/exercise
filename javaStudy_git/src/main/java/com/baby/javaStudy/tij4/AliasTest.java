package com.baby.javaStudy.tij4;

class Letter {

	public Letter(char c) {
		super();
		this.c = c;
		System.out.println(getClass().getName() + " c is " + c + "\t" + this);
	}

	public Letter() {
		super();
		System.out.println(getClass().getName() + "\t" + this);
	}

	public char c;
}

public class AliasTest {

	public static void showLetter(Letter letter) {
		System.out.println("public static void showLetter(Letter letter)");
		System.out.println("letter " + letter.c);
	}

	public static void main(String[] args) {
		System.out.println("public static void main(String[] args)");
		Letter letterA = new Letter('a');
		showLetter(letterA);

	}

}