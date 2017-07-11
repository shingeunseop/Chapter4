package com.javaex.ex01;

public class Studnet {
	private String name;
	private String school;
	
	public Studnet(String name, String school) {
		this.name=name;
		this.school=school;
	}

	@Override
	public String toString() {
		return "Studnet [name=" + name + ", school=" + school + "]";
	}
	

}
