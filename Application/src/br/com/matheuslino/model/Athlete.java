package br.com.matheuslino.model.bean;

import java.util.ArrayList;
import java.util.List;

public class Athlete extends Person {
	
	// Attributes
	private Person mother;
	private Person father;
	private boolean travelAuthorization;
	private boolean ableToPlay;
	private List<Sport> sports = new ArrayList<>();
	private int susCard;
	private School school;
	private String schoolGrade;
	private String classroom;
	private Period period;

	// Methods
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public boolean isTravelAuthorization() {
		return travelAuthorization;
	}
	public void setTravelAuthorization(boolean travelAuthorization) {
		this.travelAuthorization = travelAuthorization;
	}
	public boolean isAbleToPlay() {
		return ableToPlay;
	}
	public void setAbleToPlay(boolean ableToPlay) {
		this.ableToPlay = ableToPlay;
	}
	public List<Sport> getSports() {
		return sports;
	}
	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	public int getSusCard() {
		return susCard;
	}
	public void setSusCard(int susCard) {
		this.susCard = susCard;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getSchoolGrade() {
		return schoolGrade;
	}
	public void setSchoolGrade(String schoolGrade) {
		this.schoolGrade = schoolGrade;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}
}
