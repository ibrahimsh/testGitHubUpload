package com.lbasoftware.webproject.service;

import org.springframework.stereotype.Service;

import com.lbasoftware.webproject.model.user;
import com.lbasoftware.webproject.repostory.userDao;
@Service
public class userService {
	
	userDao userRepos;
	
	public user addUser(user u)
	{
		return userRepos.save(u);
	}

}
