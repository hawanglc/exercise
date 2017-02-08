package com.baby.javaStudy.tij4;

public class OverrideToString {
	
	private String field1;

	public OverrideToString() {
		super();
		System.out.println(getClass().getName() + "\t" + this);
	}

	@Override
	public String toString() {
		//System.out.println("public String toString()" + this);
		//return "OverrideToString []";
		
		this.field1 = "OverrideToString []";
		return this.field1;
	}

	public static void main(String[] args) {
		OverrideToString overrideToString1 = new OverrideToString();
		OverrideToString overrideToString2 = new OverrideToString();

	}

}