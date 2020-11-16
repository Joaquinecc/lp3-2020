package com.tplp3.reviews;

public class Discount extends Promotion {
	float percentage;
	
	public Discount(String name, String site,float percentage) {
		super(name, site);
		// TODO Auto-generated constructor stub
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
