package com.baby.javaStudy.tij4;


public class StaticTest {
	private static int ClassNo1;
	private static int ClassNo2 = 20;
	private static int ClassNo3;
	private int otherNumber;

	static {
		System.out.println("静态数据成员，属于类所共有，只会执行一次");
		ClassNo3 = 30;
	}

	{
		System.out.println("非静态数据成员是属于对象的，只要有对象生成，他就会执行。\t" + this);
		otherNumber = 100;
	}

	public StaticTest() {

		super();
		
		System.out.println("===before create object StaticTest()\t" + this);
		System.out.println(this);
		System.out.println("static int ClassNo = " + StaticTest.ClassNo1);
		System.out.println("static int ClassNo2 = " + StaticTest.ClassNo2);
		System.out.println("static int ClassNo3 = " + StaticTest.ClassNo3);
		System.out.println("int otherNumber = " + otherNumber);
		System.out.println("===after create object StaticTest()\t" + this);
	}

	public static int getClassNo1() {
		return ClassNo1;
	}

	public static void increMentClassNo() {
		ClassNo1++;
		ClassNo2++;
		ClassNo3++;
	}

	public int getOtherNumber() {
		return otherNumber;
	}

	public void setOtherNumber(int otherNumber) {
		//static final int a =10;
		this.otherNumber = otherNumber;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * otherNumber不是static型的，他属于某一个对象，在没有对象存在的情况下，变量将不能被访问。
		 * 这也是otherNumber不能用在static方法中的原因。
		 */
		// System.out.println("otherNumber is "+otherNumber);

		// 不要对象也可以访问static变量
		System.out.println("default value of static int classNo is " + StaticTest.ClassNo1);
		System.out.println("value of static int ClassNo2 is " + StaticTest.ClassNo2);

		StaticTest staticTest1 = new StaticTest();
		
		

		StaticTest.increMentClassNo();
		System.out.println("StaticTest.getClassNo1() is " + StaticTest.getClassNo1());
		// 使用以下的方式也可以访问静态数据成员。但是eclipse会有告警，最好的方式就是使用类名来访问。
		staticTest1.ClassNo1++;
		staticTest1.ClassNo2++;
		System.out.println("staticTest1.getClassNo1() is " + staticTest1.getClassNo1());
		System.out.println("staticTest1.ClassNo2 is " + staticTest1.ClassNo2);

		StaticTest.ClassNo3++;
		System.out.println("staticTest1.ClassNo3 is " + StaticTest.ClassNo3);

		
		StaticTest staticTest2 = new StaticTest();
		System.out.println("staticTest2.getOtherNumber() is " + staticTest2.getOtherNumber());
		
		//System.out.println("==================");
		//static StaticTest staticTest3 = new StaticTest();
		
	}

}