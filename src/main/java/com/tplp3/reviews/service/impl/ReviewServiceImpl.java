package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Content;
import com.tplp3.reviews.domain.Review;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.repository.ContentRepository;
import com.tplp3.reviews.repository.ReviewRepository;
import com.tplp3.reviews.service.ReviewService;

import org.springframework.stereotype.Service; 

@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private ContentRepository contentRepository;
	
	
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
		List<Review> review = new ArrayList<>();
		Iterator<Review> iterator = reviewRepository.findAll().iterator();
		while (iterator.hasNext()) {
			review.add(iterator.next());
		}
		return review;
	}
	public Review CheckIdContent(Review review) {
		Optional<Content> option= contentRepository.findById(review.getContent_id());
		if (!option.isPresent()) {
			review.setContent_id(null);
			System.out.println("No existe este contenido");
		}
		return review;
		
	}
	@Override
	public void save(Review review) {
		// TODO Auto-generated method stub
			CheckIdContent(review);
			reviewRepository.save(review);
		
	}

	@Override
	public void delete(Long id) {
			reviewRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Review review, Long id) {
		// TODO Auto-generated method stub
		if(reviewRepository.existsById(id)) {
				CheckIdContent(review);
			reviewRepository.save(review);
		}
		
	}

	@Override
	public List<Review> findBySite(String site) {
		List<Review> review = new ArrayList<>();
		Iterator<Review> iterator = reviewRepository.findBySite(site).iterator();
		while (iterator.hasNext()) {
			review.add(iterator.next());
		}
		return review;
	}
}

