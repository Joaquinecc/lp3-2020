package com.tplp3.reviews.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
public class PreaccessPremiere extends Promotion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8525048488859268889L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Date dateofPremiere;
	//ForeingKey
	@ManyToOne(cascade = {CascadeType.ALL})
	protected Movie movie;

	PreaccessPremiere(){}
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