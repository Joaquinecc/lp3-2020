package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Movie;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.repository.MovieRepository;
import com.tplp3.reviews.service.MovieService;

import org.springframework.stereotype.Service; 

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieRepository movieRepository;
	@Override
	public Movie findById(Long id) {
		Movie movie=null;
		Optional<Movie> option= movieRepository.findById(id);
		if (option.isPresent()) {
			movie = option.get();
		}
		return movie;
	}

	@Override
	public List<Movie> findAll() {
		List<Movie> users = new ArrayList<>();
		Iterator<Movie> iterator = movieRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}

	@Override
	public void save(Movie movie) {
		// TODO Auto-generated method stub
		movieRepository.save(movie);
		
	}

	@Override
	public void delete(Long id) {
			movieRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Movie movie, Long id) {
		// TODO Auto-generated method stub
		if(movieRepository.existsById(id)) {
			movieRepository.save(movie);
		}
		
	}
}

