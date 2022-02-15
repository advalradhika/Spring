package com.udemy.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach : " + fortuneService.getFortune();
	}

	void customInit() {
		System.out.println("Track Coach : Inside custom init method");
	}

	void customDestroy() {
		System.out.println("Track Coach : Inside custom destroy method");
	}

}
