package org.spr.dip;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringMain {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/resources/knight.xml"));
		Knight knight = (Knight) factory.getBean("knight");
		knight.embarkQuest();

	}

}
