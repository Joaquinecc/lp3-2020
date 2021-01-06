package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.Cupons;
import com.tplp3.reviews.exception.IdNotFound;
public interface CuponsService {
	Cupons findById(Long id) throws IdNotFound;

	List<Cupons> findAll();

	void save(Cupons cupons);

	void delete(Long id);
	
	void update(Cupons cupons,Long id) throws IdNotFound;

}
