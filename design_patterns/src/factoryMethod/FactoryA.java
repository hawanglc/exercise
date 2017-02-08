package factoryMethod;

public class FactoryA implements IFactory {

	public FactoryA() {
		System.out.println(this);
	}

	@Override
	public IProduct createProduct() {
		return  new ProductA();
	}

}
