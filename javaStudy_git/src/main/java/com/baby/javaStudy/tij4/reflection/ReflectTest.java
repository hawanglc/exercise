package com.baby.javaStudy.tij4.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

interface InterfaceA {
	public void dosomething();

	public void dosomething(String string);
}

class ClassA implements InterfaceA {
	public String publicFieldA1;
	protected String protectedFieldA2;
	private int privateFieldA3;

	public ClassA() {
		super();
		System.out.println("public ClassA()\t" + this);
	}

	public ClassA(String publicFieldA1, String protectedFieldA2, int privateFieldA3) {
		super();
		this.publicFieldA1 = publicFieldA1;
		this.protectedFieldA2 = protectedFieldA2;
		this.privateFieldA3 = privateFieldA3;

		System.out.println("public ClassA(String publicFieldA1, String protectedFieldA2, int privateFieldA3)\t" + this);
	}

	public String getPublicFieldA1() {
		return publicFieldA1;
	}

	public void setPublicFieldA1(String publicFieldA1) {
		this.publicFieldA1 = publicFieldA1;
	}

	public String getProtectedFieldA2() {
		return protectedFieldA2;
	}

	public void setProtectedFieldA2(String protectedFieldA2) {
		this.protectedFieldA2 = protectedFieldA2;
	}

	public int getPrivateFieldA3() {
		return privateFieldA3;
	}

	public void setPrivateFieldA3(int privateFieldA3) {
		this.privateFieldA3 = privateFieldA3;
	}
	
	public void dosomething() {
		System.out.println("public void dosomething() \t"+getClass().getName() + "\t"+this);
	}

	public void dosomething(String string) {
		System.out.println("public void dosomething(String string) \t"+getClass().getName() + "\t"+this);
	}

}

class ClassB extends ClassA implements InterfaceA {
	public boolean publicFieldB1;
	public int publicFieldB2;
	private String privateFieldB3;
	protected String protectedFieldB4;

	public ClassB() {
		super();
		System.out.println("public ClassB()\t" + this);
	}

	public ClassB(String publicFieldA1, String protectedFieldA2, int privateFieldA3) {
		super(publicFieldA1, protectedFieldA2, privateFieldA3);
		System.out.println("public ClassB(String publicFieldA1, String protectedFieldA2, int privateFieldA3)\t" + this);
	}

	public ClassB(boolean publicFieldB1, int publicFieldB2, String privateFieldB3, String protectedFieldB4) {
		super();
		this.publicFieldB1 = publicFieldB1;
		this.publicFieldB2 = publicFieldB2;
		this.privateFieldB3 = privateFieldB3;
		this.protectedFieldB4 = protectedFieldB4;

		System.out.println(
				"public ClassB(boolean publicFieldB1, int publicFieldB2, String privateFieldB3, String protectedFieldB4)\t"
						+ this);
	}

	public boolean isPublicFieldB1() {
		return publicFieldB1;
	}

	public void setPublicFieldB1(boolean publicFieldB1) {
		this.publicFieldB1 = publicFieldB1;
	}

	public int getPublicFieldB2() {
		return publicFieldB2;
	}

	public void setPublicFieldB2(int publicFieldB2) {
		this.publicFieldB2 = publicFieldB2;
	}

	public String getPrivateFieldB3() {
		return privateFieldB3;
	}

	public void setPrivateFieldB3(String privateFieldB3) {
		this.privateFieldB3 = privateFieldB3;
	}

	public String getProtectedFieldB4() {
		return protectedFieldB4;
	}

	public void setProtectedFieldB4(String protectedFieldB4) {
		this.protectedFieldB4 = protectedFieldB4;
	}

	@Override
	public void dosomething() {
		System.out.println("public void dosomething() from ClassB\t" + this);

	}

	@Override
	public void dosomething(String string) {
		System.out.println("public void dosomething() from ClassB string is [" + string + "]\t" + this);

	}

}

public class ReflectTest {

	/**
	 * @param args
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ClassA classA = new ClassA();
		classA.dosomething();

		ClassB classB = new ClassB();
		classB.dosomething();

		System.out.println("========获得类类型的方法========");
		// 获得类类型的方法1
		Class<?> typeOfClassB1 = ClassB.class;
		System.out.println("typeOfClassB1\t" + typeOfClassB1);

		// 获得类类型的方法2
		try {
			Class<?> typeOfClassB2 = Class.forName("com.baby.ClassB");
			System.out.println("typeOfClassB1\t" + typeOfClassB2);
		} catch (ClassNotFoundException e) {
			System.out.println("class [com.baby.ClassB] is not found");
		}

		// 获得类类型的方法3
		Class<?> typeOfClassB3 = classB.getClass();
		System.out.println("typeOfClassB3\t" + typeOfClassB3);

		System.out.println("========获得类的属性1========");

		// 获得类的属性。getFields能获得类的非privte的属性
		Field[] fields = ClassB.class.getFields();
		for (Field field : fields) {
			System.out.println("属性的全称名称:" + field.toString());
			System.out.println("\t属性的类型:" + field.getType() + "\t属性的名称:" + field.getName() + "\t");
		}

		System.out.println("========获得类的属性2========");
		// 获得类的属性
		Field[] declaredFields = ClassB.class.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println("属性的全称名称:" + field.toString());
			System.out.println("\t属性的类型:" + field.getType() + "\t属性名称:" + field.getName() + "\t");
		}
		
		try {
			ClassB.class.getDeclaredField("file1");
		} catch (NoSuchFieldException e) {
			System.out.println("cat find filed file1");
		}

		System.out.println("========获得类的方法========");
		Method[] methods = ClassB.class.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("类的方法:" + method);
			System.out.println("\t方法的返回值:" + method.getReturnType() + "\t方法的名称:" + method.getName());
			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("\t参数类型:" + parameter.getType());
			}
		}

		try {
			ClassB.class.getDeclaredMethod("method1");
		} catch (NoSuchMethodException e) {
			System.out.println("cat find method method1");
		}

		System.out.println("========获得类的构造器========");
		Constructor<?>[] constructors = ClassB.class.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("类的构造器:" + constructor);
			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("\t参数类型:" + parameter.getType());
			}
		}

		System.out.println("========获得类的接口========");
		Class<?>[] classBInterfaces = ClassB.class.getInterfaces();
		for (Class<?> itf : classBInterfaces) {
			System.out.println("interface from Person is [" + itf.getName() + "] or [" + itf.getSimpleName() + "]");
		}

		System.out.println("========获得类的父类========");
		Class<? super ClassB> classBSuperClasses = ClassB.class.getSuperclass();
		System.out.println("super class of Person is [" + classBSuperClasses.getName() + "] or ["
				+ classBSuperClasses.getSimpleName() + "]");

		//使用invoke来调用对象，即运行对象的一个方法。
		System.out.println("========获得调用类的方法========");
		try {
			Method methodDosomething1 = ClassB.class.getMethod("dosomething");
			methodDosomething1.invoke(classB);
			
		} catch (NoSuchMethodException e) {
			System.out.println("can not find method dosomething");
		}
		
		try {
			Method methodDosomething2 = ClassB.class.getMethod("dosomething", String.class);
			methodDosomething2.invoke(classB, "test string2");
			
		} catch (NoSuchMethodException e) {
			System.out.println("can not find method dosomething(String)");
		}

	}
}
