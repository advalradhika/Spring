package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach1 == theCoach2);
		context.close();

	}

}
