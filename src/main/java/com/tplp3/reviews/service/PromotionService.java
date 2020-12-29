package com.tplp3.reviews.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.Promotion;
@Service
public interface PromotionService {
	Promotion findById(Long id);

	List<Promotion> findAll();

	void save(Promotion prom);

	void delete(Long id);

}
