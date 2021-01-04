package com.tplp3.reviews.service;
import java.util.List;



import com.tplp3.reviews.domain.Promotion;

public interface PromotionService {
	Promotion findById(Long id);

	List<Promotion> findAll();

	void save(Promotion prom);

	void delete(Long id);
	
	void update(Promotion prom,Long id);
}
