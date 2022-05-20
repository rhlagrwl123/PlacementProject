package com.cg.placement.service;

import com.cg.placement.entities.User;

public interface IUserService {
	User addNewUser(User user);
	User updateUser(User user);
	User login(User user);
	boolean logOut();

}
