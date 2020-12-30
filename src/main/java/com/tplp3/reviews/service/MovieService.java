package com.tplp3.reviews.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.Movie;

@Service
public interface MovieService {
	Movie findById(Long id);

	List<Movie> findAll();

	void save(Movie movie);

	void delete(Long id);

}
