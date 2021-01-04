package com.tplp3.reviews.service;

import java.util.List;

import com.tplp3.reviews.domain.Curador;

public interface CuradorService {
	Curador findById(Long id);

	List<Curador> findAll();

	void save(Curador curador);

	void delete(Long id);
	

	void update(Curador curador,Long id);
}
