package strategy;

public class LowerCase extends Processer {
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}
