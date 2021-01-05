 package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

//	protected String site;
	
	protected Long content_id;
	protected Long revEntity_id;
	protected String nameRevEntity;
	
	

	public String getNameRevEntity() {
		return nameRevEntity;
	}
	public void setNameRevEntity(String nameRevEntity) {
		this.nameRevEntity = nameRevEntity;
	}
	public Long getRevEntity_id() {
		return revEntity_id;
	}
	public void setRevEntity_id(Long revEntity_id) {
		this.revEntity_id = revEntity_id;
	}
	public Long getContent_id() {
		return content_id;
	}
	public void setContent_id(Long content_id) {
		this.content_id = content_id;
	}
	protected float rating;
	Review (){}
//	public Review(String site, Content cont, float rating) {
//		super();
//		this.site = site;
//		this.rating = rating;
//	}
//	public String getSite() {
//		return site;
//	}
//	public void setSite(String site) {
//		this.site = site;
//	}

	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
//	public static int getCounter() {return counter;}
	
}
