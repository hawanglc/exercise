package com.baby.javaStudy.tij4.io;


import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

	public static void main(String[] args) {
		File path = new File(".");
		String[] fileNames = null;
		
		if (args.length == 0) {
			fileNames = path.list();
		} else {
			fileNames = path.list(new DirFilter(args[0]));
		}
		
		Arrays.sort(fileNames, String.CASE_INSENSITIVE_ORDER);
		for (String string : fileNames) {
			System.out.println(string);
		}
	}
}

class DirFilter implements FilenameFilter{
	private Pattern pattern;
	
	public DirFilter(String regex){
		pattern = Pattern.compile(regex);
	}

	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
}