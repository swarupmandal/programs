package org.spr.sprmain;

import org.spr.model.Performer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/resources/juggler.xml");
		ConfigurableApplicationContext ca = new ClassPathXmlApplicationContext("/resources/footballer.xml");
		Performer performer = (Performer) ca.getBean("steave");
		performer.perform();
	}
}
