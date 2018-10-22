package org.spr.jaxservice.jaxwsrpc;

import java.security.SecureRandom;
import java.util.stream.IntStream;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		//Endpoint.publish("http//localhost:7779/ws/hello", new HelloWorldImpl());
		/*int randompin = (int)(Math.random()*9000)+1000;
		
		System.out.println(randompin);
		
		*/
		
		SecureRandom sr = new SecureRandom();
		int i = sr.nextInt(9000)+999;
		System.out.println(i);
		
	}
}
