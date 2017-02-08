package abstractFactory;

public class Factory2 implements IFactory {

	public Factory2() {
		System.out.println(this);
	}

	@Override
	public IProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public IProductB createProductB() {
		return new ProductB2();
	}

}
