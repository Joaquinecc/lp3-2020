package com.tplp3.reviews.service.impl;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Spectator;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.repository.SpectatorRepository;

import org.springframework.stereotype.Service; 

@Service
public class SpectatorServiceImpl implements com.tplp3.reviews.service.SpectatorService {
	@Autowired
	private SpectatorRepository spectatorRepository;
	@Override
	public Spectator findById(Long id) {
		Spectator spectator=null;
		Optional<Spectator> option= spectatorRepository.findById(id);
		if (option.isPresent()) {
			spectator = option.get();
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

	@Override
	public void save(Spectator spectator) {
		// TODO Auto-generated method stub
		spectatorRepository.save(spectator);
		
	}

	@Override
	public void delete(Long id) {
			spectatorRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Spectator spectator, Long id) {
		// TODO Auto-generated method stub
		if(spectatorRepository.existsById(id)) {
			spectatorRepository.save(spectator);
		}
		
	}
}
