package design_patterns.simpleFactory;

public class Client {
	public static void main(String[] args) {
		Factory factory = new Factory();
		IProduct productA = factory.createProduct("A");
		productA.showMsg();
		System.out.println("============================");
		IProduct productB = factory.createProduct("B");
		productB.showMsg();

	}
}
