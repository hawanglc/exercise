package abstractFactory;

public class ProductA1 implements IProductA {

	public ProductA1() {
		System.out.println(this);
	}

	@Override
	public void showMsg() {
		System.out.println("showMsg() from "+this);
		
	}

}