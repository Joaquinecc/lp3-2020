package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.Review;
import com.tplp3.reviews.domain.User;
public interface ReviewService {
	Review findById(Long id);

	List<Review> findAll();
	
	List<Review> findBySite(String site);

	void save(Review review);

	void delete(Long id);
	
	void update(Review review,Long id);
}
