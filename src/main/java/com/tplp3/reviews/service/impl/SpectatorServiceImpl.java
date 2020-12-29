package com.tplp3.reviews.service.impl;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Spectator;
import com.tplp3.reviews.repository.SpectatorRepository;

import org.springframework.stereotype.Service; 

@Service
public class SpectatorServiceImpl implements com.tplp3.reviews.service.SpectatorService {
	@Autowired
	private SpectatorRepository adminRepository;
	@Override
	public Spectator findById(Long id) {
		Spectator admin=null;
		Optional<Spectator> option= adminRepository.findById(id);
		if (option.isPresent()) {
			admin = option.get();
		}
		return admin;
	}

	@Override
	public List<Spectator> findAll() {
		List<Spectator> users = new ArrayList<>();
		Iterator<Spectator> iterator = adminRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}

	@Override
	public void save(Spectator admin) {
		// TODO Auto-generated method stub
		adminRepository.save(admin);
		
	}

	@Override
	public void delete(Long id) {
			adminRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
}
