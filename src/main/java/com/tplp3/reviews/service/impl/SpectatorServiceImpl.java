package com.tplp3.reviews.service.impl;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Review;
import com.tplp3.reviews.domain.Spectator;
import com.tplp3.reviews.domain.Spectator;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.repository.ReviewRepository;
import com.tplp3.reviews.repository.SpectatorRepository;

import org.springframework.stereotype.Service; 

@Service
public class SpectatorServiceImpl implements com.tplp3.reviews.service.SpectatorService {
	@Autowired
	private SpectatorRepository spectatorRepository;
	@Autowired
	private ReviewRepository reviewRepository;
	@Override
	public Spectator findById(Long id) throws IdNotFound {
		Spectator spectator=null;
		Optional<Spectator> option= spectatorRepository.findById(id);
		if (option.isPresent()) {
			spectator = option.get();
		}else {
			throw new IdNotFound("Spectator");
		}
		return spectator;
	}

	@Override
	public List<Spectator> findAll() {
		List<Spectator> users = new ArrayList<>();
		Iterator<Spectator> iterator = spectatorRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}
	
	
	
	private Spectator checkReview(Spectator spectator) {
		Iterator<Long> iter=spectator.getHistorialReviewId().iterator();
		ArrayList<Review> review= new ArrayList<Review>();
		Review rev=null;
		Long id= (long) 10;
		while(iter.hasNext()) {
			id= (Long) iter.next();
			Optional<Review> option= reviewRepository.findById(id);
			System.out.println("\n\n "+id.toString()+"\n");
		
			if (option.isPresent()) {
				rev = option.get();
				System.out.println(rev+"\n");
				review.add(rev);
				rev=null;
			}else {
				System.out.println("Id not found "+id.toString()+"\n");
				iter.remove();
			}
			
		}
//		spectator.setPromotionAvailable(review);
//		System.out.println("\n\n\n Sali  \n\n");
//		System.out.println(review);
//		System.out.println(spectator);
		
		return spectator;
	}
	

	@Override
	public void save(Spectator spectator) {
		// TODO Auto-generated method stub
		checkReview(spectator);
		spectatorRepository.save(spectator);
		
	}

	@Override
	public void delete(Long id) {
			spectatorRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Spectator spectator, Long id) throws IdNotFound {
		// TODO Auto-generated method stub
		if(spectatorRepository.existsById(id)) {
			checkReview(spectator);
			spectatorRepository.save(spectator);
		}else {
			throw new IdNotFound("Spectator");
		}
		
	}
}
