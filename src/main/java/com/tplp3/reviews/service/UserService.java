package com.tplp3.reviews.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.User;

@Service
public interface UserService {
	User findById(Long id);

	List<User> findAll();

	void save(User user);

	void delete(Long id);
	
	void update(User user,Long id);
}
