package factoryMethod;

public class ProductA implements IProduct {

	public ProductA() {
		System.out.println(this);
	}

	@Override
	public void showMsg() {
		System.out.println("showMsg() from " + this);

	}

}
