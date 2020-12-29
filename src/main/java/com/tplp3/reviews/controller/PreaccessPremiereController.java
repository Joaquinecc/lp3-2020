package com.tplp3.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.PreaccessPremiere;
import com.tplp3.reviews.service.PreaccessPremiereService;

import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.PREACCESS)
public class PreaccessPremiereController {
	@Autowired
	private PreaccessPremiereService preaccessPremiereService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PreaccessPremiere greetings(@PathVariable("id") Long id) {
    	PreaccessPremiere Admins = preaccessPremiereService.findById(id);
        return Admins;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<PreaccessPremiere> list() {
        return preaccessPremiereService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody PreaccessPremiere preacces) {
    	preaccessPremiereService.save(preacces);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	preaccessPremiereService.delete(id);
    }

}
