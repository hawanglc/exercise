package com.baby.javaStudy.tij4.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList3 {
	public static void main(final String[] args) {
		File path = new File(".");
		String[] fileNames = null;
		
		if (args.length == 0) {
			fileNames = path.list();
		} else {
			fileNames = path.list( new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
			} );
		}
		
		Arrays.sort(fileNames,String.CASE_INSENSITIVE_ORDER);
		for (String string : fileNames) {
			System.out.println(string);
		}
	}

}