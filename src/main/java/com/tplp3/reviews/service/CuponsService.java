package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.Cupons;
public interface CuponsService {
	Cupons findById(Long id);

	List<Cupons> findAll();

	void save(Cupons cupons);

	void delete(Long id);
	
	void update(Cupons cupons,Long id);

}
