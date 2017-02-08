package abstractFactory;

public class ProductB2 implements IProductB {

	public ProductB2() {
		System.out.println(this);
	}

	@Override
	public void showMsg() {
		System.out.println("showMsg() from "+this);
		
	}

}