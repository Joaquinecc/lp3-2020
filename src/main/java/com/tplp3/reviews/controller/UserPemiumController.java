package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.UserPremium;
import com.tplp3.reviews.service.UserPremiumService;
import com.tplp3.reviews.constant.ApiPath;	


//@RestController
//@RequestMapping(ApiPath.USER_PREMIUM)
public class UserPemiumController {
	@Autowired
	private UserPremiumService adminService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserPremium greetings(@PathVariable("id") Long id) {
    	UserPremium Admins = adminService.findById(id);
        return Admins;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserPremium> list() {
        return adminService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody UserPremium userp) {
    	adminService.save(userp);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	adminService.delete(id);
    }

}