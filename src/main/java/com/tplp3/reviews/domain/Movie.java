package com.tplp3.reviews.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

 
 


@Entity
public class Movie extends Content {
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	protected String[] directors;
	protected String [] Actors;
	Movie(){}
	public Movie(String category, String title,String[] Dir,String [] actors) {
		super(category, title);
		// TODO Auto-generated constructor stub
	}
	public String[] getDirectors() {
		return directors;
	}
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}
	public String[] getActors() {
		return Actors;
	}
	public void setActors(String[] actors) {
		Actors = actors;
	}


}