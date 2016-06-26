package com.ocejbcd.test.helloworld;

import javax.ejb.Stateless;

@Stateless
public class HelloBean implements Hello{
    public String sayHello(){
        return "Hello World!!!!";
    }
}
