package abstractFactory;

public class ProductA2 implements IProductA {

	public ProductA2() {
		System.out.println(this);
	}

	@Override
	public void showMsg() {
		System.out.println("showMsg() from "+this);
		
	}

}
