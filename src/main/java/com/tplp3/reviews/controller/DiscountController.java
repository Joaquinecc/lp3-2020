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
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.service.DiscountService;

@RestController
@RequestMapping(ApiPath.DISCOUNT)
public class DiscountController {
	@Autowired
	private DiscountService discountService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Discount greetings(@PathVariable("id") Long id) {
    	try {
    	Discount Admins = discountService.findById(id);
        return Admins;
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Descuento");
    		return null;
    	}
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Discount> list() {
        return discountService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Discount discount) {
    	discountService.save(discount);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	discountService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Discount discount) {
    	try {
    	discount.setPromotionId(id);
    	discountService.update(discount, id);
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Descuento");
    	
    	}
    }

}
