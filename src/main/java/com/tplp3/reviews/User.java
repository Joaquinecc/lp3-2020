package com.tplp3.reviews;

public class User {
	protected String username;
	protected String email;
	protected String passw;
	protected boolean passwordIsStillValid;
	
	User(String username, String email, String passw){}
	public boolean login(String username,String passw) {return true;}
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
