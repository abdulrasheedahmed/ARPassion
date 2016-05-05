package com.arpassion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(columnDefinition = "TEXT")
	private String lastName;
	
	@Column(columnDefinition = "TEXT")
    private String firstName;
    
    public Person(){
    	
    }
    
	public Person(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + "]";
	}
    
    
}
