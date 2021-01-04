package com.tplp3.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.service.UserService;
import com.tplp3.reviews.constant.ApiPath;	


@RestController
@RequestMapping(ApiPath.USER)
public class UserController {
	@Autowired
	private UserService userService;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User greetings(@PathVariable("id") Long id) {
    	User users = userService.findById(id);
        return users;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> list() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody User user) {
    	userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	userService.delete(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id,@RequestBody User user) {
    	user.setId(id);
    	userService.update(user, id);
    }
}
