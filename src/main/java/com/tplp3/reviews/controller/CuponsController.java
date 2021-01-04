package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.Cupons;
import com.tplp3.reviews.service.CuponsService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.CUPONS)
public class CuponsController {
	@Autowired
	private CuponsService cuponsService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cupons greetings(@PathVariable("id") Long id) {
    	Cupons Admins = cuponsService.findById(id);
        return Admins;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Cupons> list() {
        return cuponsService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Cupons cupons) {
    	cuponsService.save(cupons);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	cuponsService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Cupons cupon) {
    	cupon.setPromotionId(id);
    	cuponsService.update(cupon, id);
    }
}
