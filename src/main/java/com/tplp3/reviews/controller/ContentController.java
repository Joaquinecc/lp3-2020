package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.Content;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.service.ContentService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.CONTENT)
public class ContentController {
	@Autowired
	private ContentService contentService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Content greetings(@PathVariable("id") Long id) {
    	try{
    		Content Admins = contentService.findById(id);
    		 return Admins;
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Contenido");
    		return null;
    	}
       
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Content> list() {
        return contentService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Content content) {
    	contentService.save(content);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	contentService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Content content) {
    	try {
	    	content.setContentId(id);
	    	contentService.update(content, id);
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Contenido");
    	
    	}
    }

}
