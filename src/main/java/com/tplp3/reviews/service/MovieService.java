package com.tplp3.reviews.service;
import java.util.List;



import com.tplp3.reviews.domain.Movie;



public interface MovieService {
	Movie findById(Long id);

	List<Movie> findAll();

	void save(Movie movie);

	void delete(Long id);
	 
	void update(Movie movie,Long id);

}
