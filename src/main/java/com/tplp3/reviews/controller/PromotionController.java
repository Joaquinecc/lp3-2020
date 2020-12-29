package com.tplp3.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.constant.ApiPath;
import com.tplp3.reviews.domain.Promotion;
import com.tplp3.reviews.service.PromotionService;

//@RestController
//@RequestMapping(ApiPath.PROMOTION)
public class PromotionController {

	@Autowired
	private PromotionService adminService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Promotion greetings(@PathVariable("id") Long id) {
    	Promotion Admins = adminService.findById(id);
        return Admins;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Promotion> list() {
        return adminService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Promotion prom) {
    	adminService.save(prom);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	adminService.delete(id);
    }
}
