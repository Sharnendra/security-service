package com.cognizant.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.app.modal.User;

@Service
public class UserService {
	
	public List<User> getAllUsers()
	{
		return Arrays.asList(
	           new User("Daenerys Targaryen","3521"),
	           new User("John Snow","3522"));
	}

}
