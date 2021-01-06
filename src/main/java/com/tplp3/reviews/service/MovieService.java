package com.tplp3.reviews.service;
import java.util.List;



import com.tplp3.reviews.domain.Movie;
import com.tplp3.reviews.exception.IdNotFound;



public interface MovieService {
	Movie findById(Long id) throws IdNotFound;

	List<Movie> findAll();

	void save(Movie movie);

	void delete(Long id);
	 
	void update(Movie movie,Long id) throws IdNotFound;

}
