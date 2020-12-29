package com.tplp3.reviews.domain;


import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Admin extends User {
//	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long IdAdmin;
	public Admin(){}
	Admin(String username, String email, String passw){
		super( username,  email,  passw);
	}

	public User createUser(String username, String email, String passw,Map<String, Object> map) {
		//With map we identifies what type of user to create and their atributes
		return null;
	}
	public Content createContent(String Title,String Cat,Map<String, Object> map) {
		//With the key ot the map  we identifies what type of contet(EX: movies) and their atributes
		return null;}
	public Review createReview(String company, Content cont, float rating) {
		return null;
	}
	public Promotion CreatePromotion(String name, String site,Map<String, Object> map) {
		//with map's keys we idenify the type of promotion with their proper atributes
		return null;}
	
	public User editUser(Map<String, Object> map) {return null;	}
	public Content editContent(Map<String, Object> map) {return null;}
	public Review editReview(String company, Content cont, float rating) {return null;}
	public Promotion editPromotion(Map<String, Object> map) {return null;}
	public static User changePassword(User user,String oldPasswd,String newPasswd) {return null;};
	
	
	
}
