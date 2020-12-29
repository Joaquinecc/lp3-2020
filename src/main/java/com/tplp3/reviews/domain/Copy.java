package com.tplp3.reviews.domain;
import java.util.ArrayList;
public class Copy {
	
	//This function is useful when you want to create a new userPremium but want the same promotion that other userPremium have
	public static UserPremium CopyPromotionFromUserPremium(UserPremium Dest,UserPremium Origin) {
		//copy the promotion that user Origin have to user Dest.
		ArrayList<Promotion> promotionFromCopy= Origin.getPromotionAvailable();
		for(Promotion prom: promotionFromCopy) {
			Dest.AddPromotion(prom);
		}
		
		return Dest;
		
	}
}
