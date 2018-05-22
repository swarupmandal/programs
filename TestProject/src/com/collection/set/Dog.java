package com.collection.set;

public class Dog implements Cloneable{
	
	private Dog() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
		 
	}
	
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		System.out.println("D1 ==>"+System.identityHashCode(d1));
		
		try {
			
			Dog d2 = (Dog) d1.clone();
			System.out.println("D2 ==>"+System.identityHashCode(d2));
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			
			Dog d3 = (Dog) Class.forName("com.collection.set.Dog").newInstance();
			System.out.println("D3 ==>"+System.identityHashCode(d3));
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	

}
