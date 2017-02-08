package com.baby.javaStudy.tij4.generic;

class Product {

	public Product() {
		System.out.println("Product::Product() " + this.getClass().toString());
	}
	
	public void showProductName(){
		System.out.println("Product::showProductName() " + this.getClass().toString());
	}

}

class ProductA extends Product {

	public ProductA() {
		System.out.println("ProductA::ProductA()" + this.getClass().toString());
	}
	
	public void showProductName(){
		System.out.println("ProductA::showProductName() " + this.getClass().toString());
	}

}

class ProductB extends Product {

	public ProductB() {
		System.out.println("ProductB::ProductB()" + this.getClass().toString());
	}
	
	public void showProductName(){
		System.out.println("ProductB::showProductName() " + this.getClass().toString());
	}

}

public class GenericTest<T> {
	private T a;

	public GenericTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericTest(T a) {
		super();
		this.a = a;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	public static void main(String[] argc){
		GenericTest<Product> genericTest = new GenericTest<Product>(new Product());
		Product product = genericTest.getA();
		System.out.println(product);
		
		genericTest.setA(new ProductA());
		product = genericTest.getA();
		System.out.println(product);
	}

}
