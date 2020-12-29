package com.tplp3.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.constant.ApiPath;
import com.tplp3.reviews.domain.Discount;
import com.tplp3.reviews.service.DiscountService;

@RestController
@RequestMapping(ApiPath.DISCOUNT)
public class DiscountController {
	@Autowired
	private DiscountService adminService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Discount greetings(@PathVariable("id") Long id) {
    	Discount Admins = adminService.findById(id);
        return Admins;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Discount> list() {
        return adminService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Discount discount) {
    	adminService.save(discount);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	adminService.delete(id);
    }

}
