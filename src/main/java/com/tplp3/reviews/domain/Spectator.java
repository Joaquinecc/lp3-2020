package com.tplp3.reviews.domain;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


  
 

@Entity
public class Spectator extends User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	public ArrayList<Review>  history;
	Spectator(){}
	Spectator(String username, String email, String passw) {
		super(username, email, passw);
		// TODO Auto-generated constructor stub
	}
	public void consumeReview(Review rew) {}
	public ArrayList<Review> getHistory() {
		return history;
	}

}
