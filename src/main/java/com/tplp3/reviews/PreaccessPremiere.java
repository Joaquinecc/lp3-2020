package com.tplp3.reviews;

import java.sql.Date;

public class PreaccessPremiere extends Promotion {
	protected Date dateofPremiere;
	protected Movie movie;
	public PreaccessPremiere(String name, String site, Date dateofPremiere) {
		super(name, site);
		// TODO Auto-generated constructor stub
	}
	public Date getDateofPremiere() {
		return dateofPremiere;
	}
	public void setDateofPremiere(Date dateofPremiere) {
		this.dateofPremiere = dateofPremiere;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
