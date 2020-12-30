package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Review;
import com.tplp3.reviews.repository.ReviewRepository;
import com.tplp3.reviews.service.ReviewService;

import org.springframework.stereotype.Service; 

@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewRepository reviewRepository;
	@Override
	public Review findById(Long id) {
		Review review=null;
		Optional<Review> option= reviewRepository.findById(id);
		if (option.isPresent()) {
			review = option.get();
		}
		return review;
	}

	@Override
	public List<Review> findAll() {
		List<Review> users = new ArrayList<>();
		Iterator<Review> iterator = reviewRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}

	@Override
	public void save(Review review) {
		// TODO Auto-generated method stub
		reviewRepository.save(review);
		
	}

	@Override
	public void delete(Long id) {
			reviewRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
}

