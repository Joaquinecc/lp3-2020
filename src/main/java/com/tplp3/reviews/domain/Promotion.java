package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


 

@Entity
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long promotionId;
	protected String name;
	protected String site;
	protected boolean isvalid= false;
//	private static int counter;
	Promotion (){
		this.isvalid=true;
	}
	public Promotion(String name, String site) {
		super();
//		counter++;
		this.name = name;
		this.site = site;
	}
	public long getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public boolean isIsvalid() {
		return isvalid;
	}
	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}
//	public static int getCounter() {return counter;}
	
}
