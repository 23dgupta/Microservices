package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Contact;
import com.cognizant.service.IContactService;
@RestController
@RequestMapping("contact")
public class ContactController {

	
	@Autowired
	private IContactService contactService;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable Integer userId){
		return contactService.getContactOfUser(userId);
	}
}
