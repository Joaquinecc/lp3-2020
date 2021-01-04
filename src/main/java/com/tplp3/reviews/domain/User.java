package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;  
 

@Entity
public class User {
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	protected long id;
	protected String username;
	protected String email;
	protected String passw;
	protected Date CredentialDate;
	

	public Date getCredentialDate() {
		return CredentialDate;
	}
	public void setCredentialDate(Date credentialDate) {
		CredentialDate = credentialDate;
	}
	public User() {
		this.CredentialDate= new Date(); 
	};
	public User(String username, String email, String passw) {	
		super();
		this.CredentialDate= new Date(); 
		this.username = username;
		this.email = email;
		this.passw = passw;
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
