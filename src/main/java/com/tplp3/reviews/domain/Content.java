package com.tplp3.reviews.domain;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 

@Entity
public class Content implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9120999531968333140L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long contentId;
	
	public long getContentId() {
		return contentId;
	}

	public void setContentId(long contentId) {
		this.contentId = contentId;
	}
	protected String category;
	protected String title;
//	static int counter;
//	public static int getCounter() {return counter;}
	
	Content(){}
	public Content(String category, String title) {
		super();
//		counter++;
		this.category = category;
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
