package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.Curador;
import com.tplp3.reviews.service.CuradorService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.CURADOR)
public class CuradorController {
	@Autowired
	private CuradorService curadorservice;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Curador greetings(@PathVariable("id") Long id) {
    	Curador Admins = curadorservice.findById(id);
        return Admins;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Curador> list() {
        return curadorservice.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Curador curador) {
    	curadorservice.save(curador);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	curadorservice.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Curador curador) {
    	curador.setId(id);
    	curadorservice.update(curador, id);
    }


}
