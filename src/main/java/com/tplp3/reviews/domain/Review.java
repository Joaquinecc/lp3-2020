package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


 

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reviewId;
	private static int counter;
	protected String site;
	@ManyToOne
	protected Content cont;
	protected float rating;
	Review (){}
	public Review(String site, Content cont, float rating) {
		super();
		counter++;
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
	public static int getCounter() {return counter;}
	
}
