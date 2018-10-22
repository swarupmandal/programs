package org.spr.jaxservice.jaxwsrpc;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {
	
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:7779/ws/hello?wsdl");
		QName name = new QName("http://javatpoint.com/", "HelloWorldImplService");
		Service service = Service.create(name);
		HelloWorld hello = service.getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString("Hello"));
		
	}
	
	
}
