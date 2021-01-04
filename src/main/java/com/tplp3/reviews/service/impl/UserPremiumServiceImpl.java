package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.domain.UserPremium;
import com.tplp3.reviews.repository.UserPremiumRepository;

import org.springframework.stereotype.Service; 

@Service
public class UserPremiumServiceImpl implements com.tplp3.reviews.service.UserPremiumService {
	@Autowired
	private UserPremiumRepository userPremiumRepository;
	@Override
	public UserPremium findById(Long id) {
		UserPremium userPremium=null;
		Optional<UserPremium> option= userPremiumRepository.findById(id);
		if (option.isPresent()) {
			userPremium = option.get();
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

	@Override
	public void save(UserPremium userPremium) {
		// TODO Auto-generated method stub
		userPremiumRepository.save(userPremium);
		
	}

	@Override
	public void delete(Long id) {
			userPremiumRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(UserPremium userPremium, Long id) {
		// TODO Auto-generated method stub
		if(userPremiumRepository.existsById(id)) {
			userPremiumRepository.save(userPremium);
		}
		
	}
}

