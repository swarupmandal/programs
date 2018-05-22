package com.singleton;

class Singleton{
	
	private static Singleton singleton = null;
	public String s ;
	
	private Singleton(){
		
		s = "This is Singleton";
	}
	
	public static Singleton getInstance(){
		
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
	}
}


class TestSingleton {

	public static void main(String[] args) {

		Singleton o1 = Singleton.getInstance();
		Singleton o2 = Singleton.getInstance();
		
		
		o1.s = (o1.s).toUpperCase();
		
		System.out.println("String of O1==>"+o1.s);
		System.out.println("String of O2==>"+o2.s);
		
		System.out.println("HashCode of O1==>"+o1.hashCode());
		System.out.println("HashCode of O2==>"+o2.hashCode());
		
	}

}
