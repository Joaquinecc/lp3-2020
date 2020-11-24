package com.tplp3.reviews;

import java.util.ArrayList;

public class Upgrade {
//Class meant to upgrade user power
	//This method receive a spectator user and upgrade to userPremium
	public static UserPremium Spectator2UserPremium(Spectator user, ArrayList<Promotion>  prom) {
		
	 UserPremium newUser= new UserPremium(user.getUsername(),user.getEmail(),user.getPassw());
	 newUser.setPromotionAvailable(prom);
	 return newUser;
	}
	public static Admin Curador2Admin(Curador user) {
		//This method upgrade a Curador to Admin
		 Admin newUser= new Admin(user.getUsername(),user.getEmail(),user.getPassw());
		return newUser;
	}
}
