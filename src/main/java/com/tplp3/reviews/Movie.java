package com.tplp3.reviews;

public class Movie extends Content {
	protected String[] directors;
	protected String [] Actors;
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
