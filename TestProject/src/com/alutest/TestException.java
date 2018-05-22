package com.alutest;

public class TestException {
	public static void main(String[] args) {
		try {
			TestException.test();
		} catch (Test2Exception e) {
			e.printStackTrace();
		}
	}

	public static void test() throws Test2Exception {
		int i = 0;
		try {
			//i++;
			i = i/0;
			throw new Test1Exception("Test1 Exception");
		} catch (Test1Exception e) {
			i++;
			throw new Test2Exception("Test2 Exception");
		} catch (Test2Exception e) {
			i++;
		} finally {
			i++;
			System.out.println("i ==>> " + i);
		}
	}
}
