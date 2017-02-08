package strategy;

public class Client {

	public static void main(String[] args) {
		Strategy strategy = new Strategy();
		String wanglc = "Wanglc male 45";
		strategy.process(new LowerCase(), wanglc);
		strategy.process(new Splitter(), wanglc);
		strategy.process(new UpperCase(), wanglc);

	}

}
