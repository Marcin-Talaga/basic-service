package com.epam.basicservice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.epam.basicservice.user.User;

@RestController
public class BasicController {
	
	@Autowired
	RestTemplate template;
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/login")
	public void loginUser(HttpServletRequest request, HttpServletResponse response, @RequestBody User user) {
		
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/logout")
	public void logoutUser(HttpServletRequest request, HttpServletResponse response) {
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/user/{userId}")
	public void getUserInfo(HttpServletRequest request, @PathVariable("user_id") String userId) {
	}

}
