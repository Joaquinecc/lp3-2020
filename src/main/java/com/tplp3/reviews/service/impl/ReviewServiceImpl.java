package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Content;
import com.tplp3.reviews.domain.Review;
import com.tplp3.reviews.domain.ReviewEntity;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.repository.ContentRepository;
import com.tplp3.reviews.repository.ReviewEntityRepository;
import com.tplp3.reviews.repository.ReviewRepository;
import com.tplp3.reviews.service.ReviewService;

import org.springframework.stereotype.Service; 

@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private ContentRepository contentRepository;
	@Autowired
	private ReviewEntityRepository reviewEntityRepository;
	
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
	public Review CheckReviewEntity(Review review) {
		Optional<ReviewEntity> option= reviewEntityRepository.findById(review.getRevEntity_id());
		if (!option.isPresent()) {
			review.setRevEntity_id(null);
			review.setNameRevEntity(null);
			System.out.println("No existe esta Entidad Review");
		}else {
			review.setNameRevEntity(option.get().getName());
		}
		return review;
		
	}
	@Override
	public void save(Review review) {
		// TODO Auto-generated method stub
		CheckReviewEntity(review);
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
			CheckReviewEntity(review);
				CheckIdContent(review);
			reviewRepository.save(review);
		}
		
	}

	@Override
	public List<Review> findByNameRevEntity(String NameRevEntity) {
		List<Review> review = new ArrayList<>();
		Iterator<Review> iterator = reviewRepository.findByNameRevEntity(NameRevEntity).iterator();
		while (iterator.hasNext()) {
			review.add(iterator.next());
		}
		return review;
	}

	
//	public List<Review> findBySite(Long id) {
//		List<Review> review = new ArrayList<>();
//		Iterator<Review> iterator = reviewRepository.findByrevEntity_id(id).iterator();
//		while (iterator.hasNext()) {
//			review.add(iterator.next());
//		}
//		return review;
//	}
}

