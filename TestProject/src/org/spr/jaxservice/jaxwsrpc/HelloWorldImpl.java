package org.spr.jaxservice.jaxwsrpc;

import javax.jws.WebService;

@WebService(endpointInterface = "org.spr.jaxservice.jaxwsrpc.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		
		return "RPC style jax ws " + name;
	}

	
	
}
