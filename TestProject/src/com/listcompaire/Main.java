package com.listcompaire;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<FoodItem> list1 = new ArrayList<FoodItem>();
		
		
		FoodItem foodItem = null;
		
		
		foodItem = new FoodItem();
		foodItem.setId(1);
		foodItem.setName("dal");
		foodItem.setTest("salt");
		list1.add(foodItem);
		
		foodItem = new FoodItem();
		foodItem.setId(2);
		foodItem.setName("bhat");
		foodItem.setTest("normal");
		list1.add(foodItem);
		
		foodItem = new FoodItem();
		foodItem.setId(3);
		foodItem.setName("sabji");
		foodItem.setTest("salt");
		list1.add(foodItem);
		
		foodItem = new FoodItem();
		foodItem.setId(4);
		foodItem.setName("mach");
		foodItem.setTest("salt");
		list1.add(foodItem);
		
		foodItem = new FoodItem();
		foodItem.setId(5);
		foodItem.setName("chikn");
		foodItem.setTest("spicy");
		list1.add(foodItem);
		
		foodItem = new FoodItem();
		foodItem.setId(6);
		foodItem.setName("Payes");
		foodItem.setTest("misti");
		list1.add(foodItem);
		
		
		ArrayList<FoodItem> list2 = new ArrayList<FoodItem>();
		
		
		
		foodItem = new FoodItem();
		foodItem.setId(7);
		foodItem.setName("parota");
		foodItem.setTest("normal");
		list2.add(foodItem);
		
		
		foodItem = new FoodItem();
		foodItem.setId(8);
		foodItem.setName("dal");
		foodItem.setTest("salt");
		list2.add(foodItem);
		
		
		foodItem = new FoodItem();
		foodItem.setId(1);
		foodItem.setName("dal");
		foodItem.setTest("normal");
		list2.add(foodItem);
		
		
		foodItem = new FoodItem();
		foodItem.setId(9);
		foodItem.setName("rajma");
		foodItem.setTest("salt");
		list2.add(foodItem);
		
		
		foodItem = new FoodItem();
		foodItem.setId(2);
		foodItem.setName("bhat");
		foodItem.setTest("normal");
		list2.add(foodItem);
		
		foodItem = new FoodItem();
		foodItem.setId(10);
		foodItem.setName("misti");
		foodItem.setTest("misti");
		list2.add(foodItem);
		
		
		ArrayList<FoodItem> l = (ArrayList<FoodItem>) removes(list1, list2);
		
		for(FoodItem food : l){
			System.out.println(food);
		}
		
	}
	
	
	public static List<FoodItem> removes(ArrayList<FoodItem> list1, ArrayList<FoodItem> list2){
		
		Iterator<FoodItem> itr = list1.iterator();
		
		while (itr.hasNext()) {
			
			FoodItem f = itr.next();
			
			for(FoodItem l : list2){
				if(l.getId() == f.getId()){
					itr.remove();
				}
			}
			
		}
		
		return list1;
	}
	
	
	
	

}
