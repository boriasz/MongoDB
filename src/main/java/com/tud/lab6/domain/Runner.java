package com.tud.lab6.domain;

import java.util.List;

import org.bson.types.ObjectId;

public class Runner {
	private ObjectId id;
	private String firstName;
	private String lastName;
	private String nationality;
	private int yob;
	private List<RunningShoes> runningShoes;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public List<RunningShoes> getRunningShoes() {
		return runningShoes;
	}
	public void setRunningShoes(List<RunningShoes> runningShoes) {
		this.runningShoes = runningShoes;
	}
	
	
	

}
