package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable ;


 

@Entity
public class ReviewEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7394128986515856523L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long entityReview_id;
	protected String site;
	protected String Name;

	public long getEntityReview_id() {
		return entityReview_id;
	}
	public void setEntityReview_id(long entityReview_id) {
		this.entityReview_id = entityReview_id;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}


}
