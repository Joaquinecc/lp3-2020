package com.tplp3.reviews;

public class Content {
	protected String category;
	protected String title;
	
	
	public Content(String category, String title) {
		super();
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
