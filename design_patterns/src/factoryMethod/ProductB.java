package factoryMethod;


public class ProductB implements IProduct {

	public ProductB() {
		System.out.println(this);
	}

	@Override
	public void showMsg() {
		System.out.println("showMsg() from " + this);

	}
}
