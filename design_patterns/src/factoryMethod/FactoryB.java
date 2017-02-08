package factoryMethod;

public class FactoryB implements IFactory {

	public FactoryB() {
		System.out.println(this);
	}

	@Override
	public IProduct createProduct() {
		return  new ProductB();
	}

}
