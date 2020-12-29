package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;  
 

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	protected String username;
	protected String email;
	protected String passw;
	protected Date whenWasCreated;
	

	public User() {
		this.whenWasCreated= new Date(); 
	};
	public User(String username, String email, String passw) {	
		super();
		this.whenWasCreated= new Date(); 
		this.username = username;
		this.email = email;
		this.passw = passw;
	}
	
	
	public Date getWhenWasCreated() {
		return whenWasCreated;
	}
	public void setWhenWasCreated(Date whenWasCreated) {
		this.whenWasCreated = whenWasCreated;
	}
	public boolean login(String username,String passw) {
		if(this.passw == passw && this.username == username)
			return true;
		return false;
				}
	public void changePassword(String oldpassw, String newPassw) {};
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	};

}
