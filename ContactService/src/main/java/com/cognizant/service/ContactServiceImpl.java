package com.cognizant.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Contact;


@Service
public class ContactServiceImpl implements IContactService{
	
	List<Contact> listContact=List.of(
			new Contact(1,"Durgesh","dkg@gmail.com",2),
			new Contact(2,"Sam","sam@gmail.com",3),
			new Contact(2,"Ram","ram@gmail.com",2),
			new Contact(2,"sab","sab@gmail.com",2),
			new Contact(5,"prashant","pra@gmail.com",1),
			new Contact(6,"ekta","ekta@gmail.com",1),
			new Contact(7,"anup","anup@gmail.com",3)
			
			
			
			
			
			
			);

	@Override
	public List<Contact> getContactOfUser(Integer id) {
		// TODO Auto-generated method stub
		return this.listContact.stream().filter(contact->contact.getcId().equals(id)).collect(Collectors.toList());
	}

}
