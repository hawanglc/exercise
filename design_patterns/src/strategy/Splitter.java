package strategy;

import java.util.Arrays;

public class Splitter extends Processer {
	String proecss(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
