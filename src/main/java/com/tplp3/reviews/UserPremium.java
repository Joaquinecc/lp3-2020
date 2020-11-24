package com.tplp3.reviews;

import java.util.ArrayList;

public class UserPremium extends Spectator {
	protected ArrayList<Promotion> PromotionAvailable ;
	UserPremium(String username, String email, String passw) {
	
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
