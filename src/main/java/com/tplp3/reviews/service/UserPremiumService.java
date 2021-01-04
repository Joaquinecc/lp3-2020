package com.tplp3.reviews.service;

import java.util.List;

import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.domain.UserPremium;

public interface UserPremiumService {
	UserPremium findById(Long id);

	List<UserPremium> findAll();

	void save(UserPremium userp);

	void delete(Long id);
	
	void update(UserPremium userp,Long id);
}
