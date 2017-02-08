package design_patterns.simpleFactory;

public class ProductB implements IProduct {

	public ProductB() {
		System.out.println(this);
	}

	@Override
	public void showMsg() {
		System.out.println("showMsg() from "+this);
		
	}

}
