package com.jobsity.challenge.entity;

public class PersonScore {

	private String name;
	private String score;
	
	public PersonScore(String name, String score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	
}
