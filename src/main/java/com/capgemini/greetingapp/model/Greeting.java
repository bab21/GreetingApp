package com.capgemini.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
public class Greeting {
	@Id
	private final int id;
	private final String message;
	public Greeting() {
		id=0;
		message = "";
	}
	
	public Greeting(int id,String message) {
		this.id=id;
		this.message=message;
	}
	public int getId() {
		return this.id;
	}
	public String getMessage() {
		return this.message;
	}
//	public void setId(int id) {
//		this.id=id;
//	}
//	public void setMessage(String message) {
//		this.message=message;
//	}
}
