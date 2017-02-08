package factoryMethod;

public class Client {
	public static void main(String[] args) {
		IFactory factoryA = new FactoryA();
		IProduct productA = factoryA.createProduct();
		productA.showMsg();
		System.out.println("===========================");
		IFactory factoryB = new FactoryB();
		IProduct productB = factoryB.createProduct();
		productB.showMsg();
	}
}
