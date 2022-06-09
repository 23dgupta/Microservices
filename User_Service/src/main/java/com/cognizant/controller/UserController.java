package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cognizant.entity.Contact;
import com.cognizant.entity.User;
import com.cognizant.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Integer userId) {
		
		//http://localhost:9004/contact/user
		//http://CONTACT-SERVICE/contact/user/
		User user = userService.getUser(userId);
		List<Contact> contact = this.restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+userId,List.class);
		
		user.setContact(contact);
		
		
		
		return user;
	}
	

}
