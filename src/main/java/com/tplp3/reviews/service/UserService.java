package com.tplp3.reviews.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.exception.IdNotFound;

@Service
public interface UserService {
	User findById(Long id) throws IdNotFound;

	List<User> findAll();

	void save(User user);

	void delete(Long id);
	
	void update(User user,Long id) throws IdNotFound;
}
