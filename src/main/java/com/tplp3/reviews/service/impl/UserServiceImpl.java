package com.tplp3.reviews.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.repository.UserRepository;  

@Service
public class UserServiceImpl implements com.tplp3.reviews.service.UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public User findById(Long id) throws IdNotFound {
		User user=null;
		Optional<User> option= userRepository.findById(id);
		if (option.isPresent()) {
			user = option.get();
		}else {
			throw new IdNotFound("user");
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		Iterator<User> iterator = userRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void delete(Long id) {
			userRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user, Long id) throws IdNotFound {
		// TODO Auto-generated method stub
		if(userRepository.existsById(id)) {
			userRepository.save(user);
		}else {
			throw new IdNotFound("user");
		}
		
	}


}
