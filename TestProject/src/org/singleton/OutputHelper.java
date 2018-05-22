package org.singleton;

public class OutputHelper {
	
	IOutputGenerator outputGenerator;
	
	public OutputHelper() {
		 
		outputGenerator = new CSVGenerator();
	}
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}

}
