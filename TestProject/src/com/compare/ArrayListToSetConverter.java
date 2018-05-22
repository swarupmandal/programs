package com.compare;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToSetConverter {

	public static void main(String args[]){
	      
        //Creating ArrayList for converting into HashSet
        ArrayList<String> companies = new ArrayList<String>();
        companies.add("Sony");
        companies.add("Samsung");
        companies.add("Microsoft");
        companies.add("Intel");
        companies.add("Sony");
      
        System.out.println("Size of ArrayList before Converstion: " + companies.size());
        System.out.println(companies);
      
        //Converting ArrayList into HashSet in Java
        HashSet<String> companySet = new HashSet<String>(companies);
      
        System.out.println("Size of HashSet after Converstion: " + companySet.size());
        System.out.println(companySet);
  
    }


}
