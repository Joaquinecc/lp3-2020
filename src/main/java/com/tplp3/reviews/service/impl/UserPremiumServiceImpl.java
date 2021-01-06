package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Promotion;
import com.tplp3.reviews.domain.UserPremium;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.repository.PromotionRepository;
import com.tplp3.reviews.repository.UserPremiumRepository;

import org.springframework.stereotype.Service; 

@Service
public class UserPremiumServiceImpl implements com.tplp3.reviews.service.UserPremiumService {
	
	@Autowired
	private UserPremiumRepository userPremiumRepository;
	@Autowired
	private PromotionRepository promotionRepository;
	@Override
	public UserPremium findById(Long id) throws IdNotFound{
		UserPremium userPremium=null;
		Optional<UserPremium> option= userPremiumRepository.findById(id);
		if (option.isPresent()) {
			userPremium = option.get();
		}else {
			throw new IdNotFound("User Premium");
		}
		return userPremium;
	}

	@Override
	public List<UserPremium> findAll() {
		List<UserPremium> users = new ArrayList<>();
		Iterator<UserPremium> iterator = userPremiumRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}
	private UserPremium addPromotion(UserPremium userPremium) {
		Iterator<Long> iter=userPremium.getPromotionsId().iterator();
		ArrayList<Promotion> promo= new ArrayList<Promotion>();
		Promotion promotion=null;
		Long id= (long) 10;
		while(iter.hasNext()) {
			id= (Long) iter.next();
			Optional<Promotion> option= promotionRepository.findById(id);
			System.out.println("\n\n "+id.toString()+"\n");
		
			if (option.isPresent()) {
				
				promotion = option.get();
				System.out.println(promotion+"\n");
				promo.add(promotion);
				promotion=null;
			}else {
				System.out.println("Id not found "+id.toString()+"\n");
				iter.remove();
			}
			
		}
//		userPremium.setPromotionAvailable(promo);
//		System.out.println("\n\n\n Sali  \n\n");
//		System.out.println(promo);
//		System.out.println(userPremium);
		
		return userPremium;
	}
	@Override
	public void save(UserPremium userPremium) {
		userPremium=addPromotion(userPremium);
		
		userPremiumRepository.save(userPremium);
		
	}

	@Override
	public void delete(Long id) {
			userPremiumRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(UserPremium userPremium, Long id) throws IdNotFound  {
		// TODO Auto-generated method stub
		if(userPremiumRepository.existsById(id)) {
			userPremium=addPromotion(userPremium);
			userPremiumRepository.save(userPremium);
		}else {
			throw new IdNotFound("User Premium");
		}
		
	}
}

