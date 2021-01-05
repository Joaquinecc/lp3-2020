package com.tplp3.reviews.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.ReviewEntity;
import com.tplp3.reviews.repository.ReviewEntityRepository;
import com.tplp3.reviews.service.ReviewEntityService;

@Service
public class ReviewEntityServiceImpl implements ReviewEntityService{
	@Autowired
	private ReviewEntityRepository reviewEntityRepository;
	@Override
	public ReviewEntity findById(Long id) {
		ReviewEntity reviewEntity=null;
		Optional<ReviewEntity> option= reviewEntityRepository.findById(id);
		if (option.isPresent()) {
			reviewEntity = option.get();
		}
		return reviewEntity;
	}

	@Override
	public List<ReviewEntity> findAll() {
		List<ReviewEntity> users = new ArrayList<>();
		Iterator<ReviewEntity> iterator = reviewEntityRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}

	@Override
	public void save(ReviewEntity reviewEntity) {
		reviewEntityRepository.save(reviewEntity);
		
	}

	@Override
	public void delete(Long id) {
			reviewEntityRepository.deleteById(id);
		
	}
	@Override
	public void update(ReviewEntity reviewEntity, Long id) {
		if(reviewEntityRepository.existsById(id)) {
			reviewEntityRepository.save(reviewEntity);
		}
		
	}
}
