package com.collection.set;

public class TestCopyObj {

	public String value;
	
	
	TestCopyObj(String value) {
		super();
		this.value = value;
	}

	public TestCopyObj(TestCopyObj testCopyObj) {

		//this.value = testCopyObj.value;
		this(testCopyObj.value);
	}
	
	

	@Override
	public String toString() {
		return "TestCopyObj [value=" + value + "]";
	}

	public static void main(String[] args) {

		TestCopyObj obj = new TestCopyObj("aa");
		
		TestCopyObj obj2 = new TestCopyObj(obj);
		
		System.out.println("obj==>"+obj);
		
		System.out.println("obj2==>"+obj2);
	}

}
