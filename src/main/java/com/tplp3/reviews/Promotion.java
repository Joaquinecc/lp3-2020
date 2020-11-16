package com.tplp3.reviews;

public class Promotion {
	protected String name;
	protected String site;
	protected boolean isvalid= false;
	public Promotion(String name, String site) {
		super();
		this.name = name;
		this.site = site;
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

	
}
