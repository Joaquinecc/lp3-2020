package com.tplp3.reviews;

import java.util.ArrayList;

public class Curador extends User {
	protected ArrayList<Content> cont;
	Curador(String username, String email, String passw) {
		super(username, email, passw);
		// TODO Auto-generated constructor stub
	}
	public void addContent2moderate(Content con) {}
	public void changeCategoryOfContent(Content cont) {}
	public void removeContent(int index) {}
}
