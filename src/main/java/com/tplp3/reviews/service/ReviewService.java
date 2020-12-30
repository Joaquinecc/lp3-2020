package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.Review;
public interface ReviewService {
	Review findById(Long id);

	List<Review> findAll();

	void save(Review review);

	void delete(Long id);
}
