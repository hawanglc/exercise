package abstractFactory;

public class Factory1 implements IFactory {

	public Factory1() {
		System.out.println(this);
	}

	@Override
	public IProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public IProductB createProductB() {
		return new ProductB1();
	}

}

