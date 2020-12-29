package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public  class Cupons extends Promotion {
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Qavailable;
	
	Cupons(){}
	
	public Cupons(String name, String site,int Qavailable) {
		super(name, site);
		// TODO Auto-generated constructor stub
	}
	public int getQavailable() {
		return Qavailable;
	}
	public void setQavailable(int qavailable) {
		Qavailable = qavailable;
	}

}
