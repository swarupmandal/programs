package org.spr.model;

public class Stage {
	
	public Stage() {
		
	}
	
	public static class StagesingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){
		return StagesingletonHolder.instance;
	}

}
