package com.libertymutual.goforcode.models;

import java.util.List;

import javax.persistence.OneToMany;

public class Student {
	
	private String name;
	
	@OneToMany(mappedBy = "project")
	private List<Project> projects;
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
