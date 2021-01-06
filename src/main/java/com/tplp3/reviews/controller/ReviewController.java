package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.Review;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.service.ReviewService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.REVIEW)
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
    @RequestMapping(value = "/site/{site}", method = RequestMethod.GET)
    public List<Review> ListBySite(@PathVariable("site") String site) {
    	 return reviewService.findByNameRevEntity(site);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Review greetings(@PathVariable("id") Long id) {
    	try {
    	Review Admins = reviewService.findById(id);
        return Admins;
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Review");
    		return null;
    	}
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Review> list() {
        return reviewService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Review review) {
    	reviewService.save(review);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	reviewService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Review review) {
    	try {
    	review.setReviewId(id);
    	reviewService.update(review, id);
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Review");
    	
    	}
    }


}

