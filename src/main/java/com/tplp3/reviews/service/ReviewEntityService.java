package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.ReviewEntity;
import com.tplp3.reviews.exception.IdNotFound;
public interface ReviewEntityService {
	ReviewEntity findById(Long id) throws IdNotFound;

	List<ReviewEntity> findAll();

	void save(ReviewEntity reventity);

	void delete(Long id);
	
	void update(ReviewEntity reventity,Long id) throws IdNotFound;

}
