package strategy;

public class Strategy {
	public void process(Processer processer, Object obj){
		System.out.println(processer.process(obj));
	}
}
