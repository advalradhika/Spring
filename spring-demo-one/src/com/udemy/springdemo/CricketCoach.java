package com.udemy.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String teamName;
	private String emailId;

	public CricketCoach() {
		System.out.println("Cricket Coach : Inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach : Inside setter method : Fortune Service");
		this.fortuneService = fortuneService;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("Cricket Coach : Inside setter method : Team Name");
		this.teamName = teamName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		System.out.println("Cricket Coach : Inside setter method : Email Id");
		this.emailId = emailId;
	}

	@Override
	public String getDailyWorkout() {
		return "Hit 100 balls";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach : " + fortuneService.getFortune();
	}

}
