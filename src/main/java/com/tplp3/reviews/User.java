package com.tplp3.reviews;

public class User {
	private static int counter;
	protected String username;
	protected String email;
	protected String passw;
	protected boolean passwordIsStillValid;
	
	
	public User(String username, String email, String passw) {	
		super();
		counter++;
		this.username = username;
		this.email = email;
		this.passw = passw;
	}
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
	public static int getCounter() {return counter;}
}
