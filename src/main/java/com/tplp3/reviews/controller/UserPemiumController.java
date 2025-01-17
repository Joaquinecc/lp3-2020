package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.tplp3.reviews.domain.UserPremium;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.service.UserPremiumService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.USER_PREMIUM)
public class UserPemiumController {
	@Autowired
	private UserPremiumService userPremiumService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserPremium greetings(@PathVariable("id") Long id) {
    	try {
    		UserPremium userPremium = userPremiumService.findById(id);
            return userPremium;
    		
    	} catch (IdNotFound e ) {
    		System.out
			.println("No existe el usuario Premium");
    		return null;
    	}
    
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserPremium> list() {
        return userPremiumService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody UserPremium userp) {
    	userPremiumService.save(userp);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	userPremiumService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody UserPremium userp) throws IdNotFound {
    	userp.setId(id);
    	try {

        	userPremiumService.update(userp, id);
    	} catch (IdNotFound e ) {
    		System.out
			.println("No existe el usuario");
    		
    	}
    }

}
