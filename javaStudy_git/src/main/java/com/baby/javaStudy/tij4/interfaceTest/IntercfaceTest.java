package com.baby.javaStudy.tij4.interfaceTest;

import java.lang.reflect.Method;

interface Movement {
	public void move();
}

class Fish implements Movement {

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName() + "\t can swim using tail");
	}

}

class Bird implements Movement {
	
	public void eat(){
		System.out.println("public void eat() \t" + this);
	}

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName()+"\tcan fly using wings");
	}

}

class Sparrow extends Bird {
	public void eat(){
		System.out.println("public void eat() \t" + this);
	}
}

class Swan extends Bird implements Movement {

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName()+"\tcan fly using wings and swim using feet.");
	}
}

public class IntercfaceTest {
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.move();

		Bird bird = new Bird();
		bird.move();

		Swan swan = new Swan();
		//子类中有与接口或者父类中同名且返回值类型一样的方法，则接口或者父类中的方法将被覆盖
		swan.move();

		Class<?>[] swanInterfaces = swan.getClass().getInterfaces();
		for (Class<?> swanInterface : swanInterfaces) {
			System.out.println("interface of Swan list:\t" + swanInterface.getSimpleName());
		}

		Class<?> swanSuperClass = swan.getClass().getSuperclass();
		System.out.println("superClass of Swan list:\t" + swanSuperClass.getSimpleName());

		Class<?>[] swanSuperClassesInterfaces = swanSuperClass.getInterfaces();
		for (Class<?> swanSuperClassesInterface : swanSuperClassesInterfaces) {
			System.out.println("superClassInterface of Swan list:\t" + swanSuperClassesInterface.getSimpleName());
		}
		
		//接口的名称不能通过继承关系传递给子类。
		Sparrow sparrow = new Sparrow();
		Class<?>[] sparrowInterfaces = sparrow.getClass().getInterfaces();
		if (sparrowInterfaces.length == 0) {
			System.out.println(sparrow.getClass().getSimpleName() + " does not have interfaces");
		}
		
		//接口中的方法，却可以通过继承关系传递给子类
		//基类中的方法，可以通过继承关系传递给子类
		sparrow.eat();
		Method[] sparrowMethods = sparrow.getClass().getMethods();
		for (Method method : sparrowMethods) {
			System.out.println("method of Sparrod list:\t" + method.getName());
		}
	}
}
