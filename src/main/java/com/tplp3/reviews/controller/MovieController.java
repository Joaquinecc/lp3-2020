package com.tplp3.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.tplp3.reviews.domain.Movie;
import com.tplp3.reviews.service.MovieService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.MOVIE)
public class MovieController{
	@Autowired
	private MovieService movieService;
	
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Movie greetings(@PathVariable("id") Long id) {
    	Movie users = movieService.findById(id);
        return users;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Movie> list() {
        return movieService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Movie movie) {
    	movieService.save(movie);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	movieService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Movie movie) {
    	movie.setContentId(id);
    	movieService.update(movie, id);
    }
}

