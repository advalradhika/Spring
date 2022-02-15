package com.udemy.springdemo;

public class MainApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
