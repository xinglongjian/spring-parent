package com.spring.data.redis;

public class Person {

	private String firstName=null;
	private String lastName=null;
	
	public Person(String first,String last){
		firstName=first;
		lastName=last;
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
	
	
}
