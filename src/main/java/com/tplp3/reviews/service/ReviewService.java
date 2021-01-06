package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.Review;
import com.tplp3.reviews.exception.IdNotFound;
public interface ReviewService {
	Review findById(Long id) throws IdNotFound;

	List<Review> findAll();
	
	List<Review> findByNameRevEntity(String NameRevEntity);

	void save(Review review);

	void delete(Long id);
	
	void update(Review review,Long id) throws IdNotFound;
} 
