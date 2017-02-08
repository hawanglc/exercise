package abstractFactory;

public class ProductB1 implements IProductB {

	public ProductB1() {
		System.out.println(this);
	}

	@Override
	public void showMsg() {
		System.out.println("showMsg() from "+this);
		
	}

}
