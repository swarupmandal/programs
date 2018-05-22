package com.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException {

		/*String s = "Shib";

		String s1 = new String("Shib");

		System.out.println("==" + (s == s1));

		System.out.println("equals==>" + (s.equals(s1)));

		System.out.println("substring==>" + (s.substring(0, 3)));*/

		/* 1********************** */

		// int i = Integer.parseInt(s); // java.lang.NumberFormatException

		/* 2********************** */

		/*
		 * int a[]=new int[5]; a[10]=50;
		 */// java.lang.ArrayIndexOutOfBoundsException

		/* 3******************* */

		/*
		 * String ss=null; System.out.println(ss.length());
		 */// NullPointerException

		/* 4******************* */

		// int a=50/0;//ArithmeticException

		/*try {
			@SuppressWarnings("unused")
			int a = 50 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("hiii");*/
		
		try {
			Test.fileCopyUsingNIOFilesClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void fileCopyUsingNIOFilesClass() throws IOException
	{
	    Path source = Paths.get("d:/testoriginal.txt");
	    Path destination = Paths.get("e:/ee.class");
	 System.out.println();
	    Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	}

}
