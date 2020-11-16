package com.tplp3.reviews;

import java.util.ArrayList;

public class Spectator extends User {
	public ArrayList<Review>  history;
	Spectator(String username, String email, String passw) {
		super(username, email, passw);
		// TODO Auto-generated constructor stub
	}
	public void consumeReview(Review rew) {}
	public ArrayList<Review> getHistory() {
		return history;
	}

}
