package com.libertymutual.goforcode.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	private String name;
	
	@ManyToOne
	private Student student;
	
	public Project(String name) {
		this.name = name;
	}
	
	@Column
	private Boolean firstChoice;
	
	@Column
	private Boolean secondChoice;
	
	@Column
	private Boolean thirdChoice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Boolean getFirstChoice() {
		return firstChoice;
	}

	public void setFirstChoice(Boolean firstChoice) {
		this.firstChoice = firstChoice;
	}

	public Boolean getSecondChoice() {
		return secondChoice;
	}

	public void setSecondChoice(Boolean secondChoice) {
		this.secondChoice = secondChoice;
	}

	public Boolean getThirdChoice() {
		return thirdChoice;
	}

	public void setThirdChoice(Boolean thirdChoice) {
		this.thirdChoice = thirdChoice;
	}

}
