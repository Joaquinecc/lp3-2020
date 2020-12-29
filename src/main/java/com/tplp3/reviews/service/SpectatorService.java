package com.tplp3.reviews.service;

import java.util.List;



import com.tplp3.reviews.domain.Spectator;

public interface SpectatorService {
	Spectator findById(Long id);

	List<Spectator> findAll();

	void save(Spectator Spectator);

	void delete(Long id);
}
