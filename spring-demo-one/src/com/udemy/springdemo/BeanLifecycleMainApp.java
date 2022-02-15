package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleMainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifecycle_applicationContext.xml");
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach1.getDailyWorkout());
		context.close();

	}

}
