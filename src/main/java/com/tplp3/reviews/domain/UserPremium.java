package com.tplp3.reviews.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.repository.PromotionRepository;

 

@Entity
public class UserPremium extends Spectator implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 5568134761009146741L;
	@GeneratedValue(strategy = GenerationType.AUTO)

	protected ArrayList<Promotion> PromotionAvailable ;
	protected ArrayList <Long> PromotionsId;
	
	
	public ArrayList<Long> getPromotionsId() {
		return PromotionsId;
	}
	public void setPromotionsId(ArrayList<Long> promotionsId) {
		PromotionsId = promotionsId;
	}
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
//	public ArrayList<Promotion> getPromotionAvailable() {
//		return PromotionAvailable;
//	}
//	public void setPromotionAvailable(ArrayList<Promotion> promotionAvailable) {
//		PromotionAvailable = promotionAvailable;
//	}

}
