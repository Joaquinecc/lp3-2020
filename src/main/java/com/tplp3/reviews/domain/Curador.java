package com.tplp3.reviews.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

 
 


import java.util.ArrayList;
@Entity
public class Curador extends User {
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected ArrayList<Content> cont;
	Curador(){}
	Curador(String username, String email, String passw) {
		super(username, email, passw);
		// TODO Auto-generated constructor stub
	}
	public void addContent2moderate(Content con) {}
	public void changeCategoryOfContent(Content cont) {}
	public void removeContent(int index) {}
}
