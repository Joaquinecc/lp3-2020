package com.tplp3.reviews.service;

import java.util.List;



import com.tplp3.reviews.domain.Spectator;
import com.tplp3.reviews.domain.User;

public interface SpectatorService {
	Spectator findById(Long id);

	List<Spectator> findAll();

	void save(Spectator spectator);

	void delete(Long id);
	
	void update(Spectator spectator,Long id);
}
