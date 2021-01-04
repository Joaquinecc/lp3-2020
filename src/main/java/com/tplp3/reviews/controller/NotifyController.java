package com.tplp3.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tplp3.reviews.constant.ApiPath;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.service.UserService;
import com.tplp3.reviews.utility.Notifications;

@RestController
@RequestMapping(ApiPath.NOTIFY)
public class NotifyController {
	@Autowired
	private Notifications noti;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> list() {
        return noti.NotifyExpireUsers();
    }

}
