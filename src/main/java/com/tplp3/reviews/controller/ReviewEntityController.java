package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.ReviewEntity;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.service.ReviewEntityService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.ENTITY_REVIEW)
public class ReviewEntityController{
	@Autowired
	private ReviewEntityService reviewEntityService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ReviewEntity greetings(@PathVariable("id") Long id) {
    	try {
    	ReviewEntity rev = reviewEntityService.findById(id);
        return rev;
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del ReviewEntity");
    		return null;
    	}
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ReviewEntity> list() {
        return reviewEntityService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody ReviewEntity rev) {
    	reviewEntityService.save(rev);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	reviewEntityService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody ReviewEntity rev) {
    	try {
    	rev.setEntityReview_id(id);
    	reviewEntityService.update(rev, id);
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del ReviewEntity");
    		
    	}
    }
}