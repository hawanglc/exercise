package strategy;

public class UpperCase extends Processer {
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}
