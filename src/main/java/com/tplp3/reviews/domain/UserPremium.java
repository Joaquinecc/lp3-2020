package com.tplp3.reviews.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

 

@Entity
public class UserPremium extends Spectator {
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected ArrayList<Promotion> PromotionAvailable ;
	
	UserPremium(){}
	public UserPremium(String username, String email, String passw) {
	
		super(username, email, passw);
		// TODO Auto-generated constructor stub
		this.PromotionAvailable=new ArrayList<Promotion>();
	}
	public void AddPromotion(Promotion prom) {
		this.PromotionAvailable.add(prom);
	}
	public void usePromotion(int index) {}
	public ArrayList<Promotion> getPromotionAvailable() {
		return PromotionAvailable;
	}
	public void setPromotionAvailable(ArrayList<Promotion> promotionAvailable) {
		PromotionAvailable = promotionAvailable;
	}
	
}
