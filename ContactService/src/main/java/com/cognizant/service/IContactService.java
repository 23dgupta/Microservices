package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.Contact;

public interface IContactService {
	
	public List<Contact> getContactOfUser(Integer id);

}
