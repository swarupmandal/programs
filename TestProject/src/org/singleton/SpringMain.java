package org.singleton;

public class SpringMain {
	
	public static void main(String[] args) {
		
		IOutputGenerator output = new CSVGenerator();
		output.generateOutput();
		
		OutputHelper helper = new OutputHelper();
		helper.generateOutput();
		
	}

}
