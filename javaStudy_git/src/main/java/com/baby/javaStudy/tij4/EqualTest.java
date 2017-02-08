package com.baby.javaStudy.tij4;

//定义一个新的类。不去覆盖Object.java中的public boolean equals(Object obj)方法。
class IntValue {

	public IntValue(int i) {
		super();
		this.i = i;
	}

	int i;
}

//定义一个新的类。重新定义public boolean equals(Object obj)。
class CharValue {
	char c;

	public CharValue(char c) {
		super();
		this.c = c;
	}

	public boolean equals(CharValue charValue) {
		return this.c == charValue.c;
	}
}

public class EqualTest {
	public static void main(String[] args) throws NullPointerException {
		System.out.println("==========Integer test===================");
		
		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer(10);
		Integer integer3 = new Integer(20);
		Integer integer4 = integer1;

		System.out.println("new Integer(10) == new Integer(10) is\t" + (integer1 == integer2));
		System.out.println("integer1.equals(integer2) is\t" + integer1.equals(integer2));
		System.out.println("integer1.equals(integer3) is\t" + integer1.equals(integer3));
		System.out.println("integer1 == integer4 is\t" + (integer1 == integer4));

		System.out.println("=========IntValue test====================");

		IntValue intValue1 = new IntValue(10);
		IntValue intValue2 = new IntValue(10);
		IntValue intValue3 = intValue1;

		System.out.println("new IntValue(10) == new IntValue(10) is\t" + (intValue1 == intValue2));
		System.out.println("intValue1.equals(intValue2) is\t" + intValue1.equals(intValue2));
		System.out.println("intValue1 == intValue3 is\t" + (intValue1 == intValue3));

		System.out.println("==========CharValue test===================");

		CharValue charValue1 = new CharValue('a');
		CharValue charValue2 = new CharValue('a');
		System.out.println("new CharValue('a') == new CharValue('a') is\t" + (charValue1 == charValue2));
		System.out.println("charValue1.equals(charValue2) is\t" + charValue1.equals(charValue2));

		System.out.println("=============================");

		try {
			EqualTest equalTest = null;

			if (equalTest == null) {
				System.out.println("equalTest == null");
			}

			if (equalTest.equals(null)) {
				System.out.println("equalTest.equals(null)");
			}
		} catch (NullPointerException e) {
			System.out.println("equalTest.equals(null) exception");
		} catch (Exception e) {
			System.out.println("other exception");
		}

		System.out.println(0.99999999999999999999f == 1.00000000000000000001f);
		System.out.println(
				Float.floatToIntBits(0.99999999999999999999f) == Float.floatToIntBits(1.00000000000000000001f));
		System.out.println(0.99999f == 1.00001f);
		System.out.println(Float.floatToIntBits(0.99999f) == Float.floatToIntBits(1.00001f));
		System.out.println(0.9999999f == 1.0000001f);
		System.out.println(Float.floatToIntBits(0.9999999f) == Float.floatToIntBits(1.0000001f));
	}
}
