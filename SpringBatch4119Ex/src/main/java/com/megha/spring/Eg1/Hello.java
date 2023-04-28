package com.megha.spring.Eg1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.Context.xml");
    HelloService obj=(HelloService)context.getBean("Hello");
    obj.hello();
    context.close();

    }
}
