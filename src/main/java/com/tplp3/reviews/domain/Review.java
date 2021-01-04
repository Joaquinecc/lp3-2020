 package com.tplp3.reviews.domain;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable ;


 

@Entity
public class Review implements Serializable{
	
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 6721056493669950682L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reviewId;
	
	
//	private static int counter;
	protected String site;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="contentId")
	protected Content cont;
	protected float rating;
	Review (){}
	public Review(String site, Content cont, float rating) {
		super();
//		counter++;
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
//	public static int getCounter() {return counter;}
	
}
