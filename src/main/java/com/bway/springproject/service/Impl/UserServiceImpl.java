package com.bway.springproject.service.Impl;

import org.springframework.stereotype.Service;

import com.bway.springproject.model.User;
import com.bway.springproject.repository.UserRepository;
import com.bway.springproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//private UserRepository userRepo;
	
	@Override
	public void signup(User user) {
		
		
	}

	@Override
	public User login(String un, String psw) {
		
		return null;
	}

}
