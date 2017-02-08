package design_patterns.simpleFactory;

public class Factory {
	public Factory() {
		System.out.println(this);
	}
	
	IProduct createProduct(String s){
		if (s == "A") {
			return new ProductA();
		} else if (s == "B") {
			return new ProductB();
		}else{
			return new ProductA();
		}
	}
}
