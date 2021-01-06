package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.Spectator;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.service.SpectatorService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.SPECTATOR)
public class SpectatorController {
	@Autowired
	private SpectatorService spectatorService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Spectator greetings(@PathVariable("id") Long id) {
    	try {
    	Spectator spec = spectatorService.findById(id);
        return spec;
    	}catch(IdNotFound e) {
    		System.out
			.println("No existe el Espectador");
    		return null;
    	}
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Spectator> list() {
        return spectatorService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Spectator spec) {
    	spectatorService.save(spec);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	spectatorService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Spectator spec) {
    	try {
    	spec.setId(id);
    	spectatorService.update(spec, id);
    	}catch(IdNotFound e) {
    		System.out
			.println("No existe el Espectador");
    	
    	}
    }
}
