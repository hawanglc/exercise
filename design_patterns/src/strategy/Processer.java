package strategy;

public class Processer {
	public String name(){
		return getClass().getSimpleName();
	}
	
	Object process(Object input){
		return input;
	}
}
