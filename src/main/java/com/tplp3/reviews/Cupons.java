package com.tplp3.reviews;

public class Cupons extends Promotion {
	int Qavailable;
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
