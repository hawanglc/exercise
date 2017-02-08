package abstractFactory;

public class Client {

	public static void main(String[] args) {
		IFactory factory1 = new Factory1();
		IProductA proudctA1 = factory1.createProductA();
		proudctA1.showMsg();
		System.out.println("===============================");
		IProductB productB1 = factory1.createProductB();
		productB1.showMsg();
		
		System.out.println("===============================");
		IFactory factory2 = new Factory2();
		IProductA productA2 = factory2.createProductA();
		productA2.showMsg();
		System.out.println("===============================");
		IProductB productB2 = factory2.createProductB();
		productB2.showMsg();
	}

}