package com.tplp3.reviews;

public class Review {
	protected String site;
	protected Content cont;
	protected float rating;
	public Review(String site, Content cont, float rating) {
		super();
		this.site = site;
		this.cont = cont;
		this.rating = rating;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Content getCont() {
		return cont;
	}
	public void setCont(Content cont) {
		this.cont = cont;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}
