package com.cognizant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.entity.User;

@Service
public class UserServiceImpl implements IUserService{
	
	
	List<User> userList=List.of(
			new User(1,"Durgesh","9867362377"),
			new User(2,"Sam","9833362377"),
			new User(3,"Ram","9867362377"),
			new User(4,"Sab","9867362377"));

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return this.userList.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
