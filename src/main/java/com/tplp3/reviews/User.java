package com.tplp3.reviews;

public class User {
	String username;
	String email;
	String passw;
	
	User(String nombre, String apellido, int edad){}

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
