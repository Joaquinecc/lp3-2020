package com.tplp3.reviews.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.Admin;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.service.AdminService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.ADMIN)
public class AdminController {
	@Autowired
	private AdminService adminService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Admin greetings(@PathVariable("id") Long id) {
    	try {

        	Admin Admins = adminService.findById(id);
            return Admins;
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Admin");
    		return null;
    	}
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Admin> list() {
        return adminService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Admin admin) {
    	adminService.save(admin);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	adminService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody Admin admin) {
    	try{
    		admin.setId(id);
    		adminService.update(admin, id);
    	}catch(IdNotFound e) {
    		System.out
			.println("No se encontro Id del Admin");

    	}
    	
    }

}
