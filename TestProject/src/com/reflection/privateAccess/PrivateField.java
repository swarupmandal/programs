package com.reflection.privateAccess;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.reflection.Student;

public class PrivateField {

	public String getPrivateField(Student student) throws Exception {

		Class<? extends Student> cl = student.getClass();

		Field field = cl.getDeclaredField("name");
		field.setAccessible(true);
		String name = (String) field.get(student);

		return name;
	}

	public void getPrivateMethod(Student student) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class clazz = student.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method me : methods){
			System.out.println(me.getName() + " - " + me.getModifiers() + " - " + me.getParameterCount() + " - " + me.getGenericReturnType());
		}
		
		Method method = clazz.getDeclaredMethod("test", String.class, int.class);
		method.setAccessible(true);
		method.invoke(student, "cts",2);
		
		
	}

	public void getPrivateConstructor() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {

		Class clazz = Class.forName("com.reflection.Student");
		Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
		constructor.setAccessible(true);
		Student student =(Student) constructor.newInstance("student",1);
		String name = student.getName();
		System.out.println(name);
		
	}

}
