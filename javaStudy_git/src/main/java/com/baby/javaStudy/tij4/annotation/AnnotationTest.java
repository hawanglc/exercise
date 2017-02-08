package com.baby.javaStudy.tij4.annotation;

public class AnnotationTest {

	private String privateString1 = "defaultPrivateString";

	public AnnotationTest() {
		super();
		System.out.println("public AnnotationTest()\t" + this);
	}

	public AnnotationTest(String privateString1) {
		super();
		this.privateString1 = privateString1;
		System.out.println("public AnnotationTest(String privateString1)\t" + this);
	}

	public String getPrivateString1() {
		return privateString1;
	}

	public void setPrivateString1(String privateString1) {
		this.privateString1 = privateString1;
	}

	// 这个是j2se5内置的三个注解之一，表示当前的方法将覆盖超类中的方法
	// 指明要重载toString()方法的例子。
	// 没有此方法，toString的输出将是另外一个样子。
	@Override
	public String toString() {
		return "privateString1 is " + this.privateString1;
	}

	//这个是j2se5内置的三个注解之一，指明这个方法已经过时，不建议使用。
	@Deprecated
	public void showMsg() {
		System.out.println("public void showMsg() | privateString1 is [" + this.privateString1 + "]");
	}

	// 这个是j2se5内置的三个注解之一，指明编译器要去关闭告警信息
	// 他含有一个参数。该参数是一个字符串数组。其中的参数值与取消的告警类型有关。如果有多种告警，那就需要写多个。
	// value数组中的字符串不是随便乱写的。至于该写什么，要看IDE工具能支持什么。具体参数值可以参考
	// http://blog.csdn.net/foart/article/details/6112145中的描述
	// 这个取消告警的意思就是：取消掉对过时方法的告警
	@SuppressWarnings(value = { "deprecation" })
	public void suppressWarningTest() {
		System.out.println("public static void suppressWarningTest()");
		System.runFinalizersOnExit(true);
	}

	public static void main(String[] args) {
		AnnotationTest annotationTest = new AnnotationTest();
		System.out.println(annotationTest.getPrivateString1());
		annotationTest.setPrivateString1("testB");
		annotationTest.showMsg();
		annotationTest.suppressWarningTest();
	}

}
