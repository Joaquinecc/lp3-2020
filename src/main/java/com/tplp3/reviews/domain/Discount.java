package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Discount extends Promotion {
	@GeneratedValue(strategy = GenerationType.AUTO)
	float percentage;
	Discount(){}
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
