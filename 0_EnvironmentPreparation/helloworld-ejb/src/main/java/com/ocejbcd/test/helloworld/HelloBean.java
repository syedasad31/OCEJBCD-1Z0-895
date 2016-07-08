package com.ocejbcd.test.helloworld;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
public class HelloBean implements Hello {

	@Override
	public String sayHello() {
		return "Hello World!!!!";
	}

}
