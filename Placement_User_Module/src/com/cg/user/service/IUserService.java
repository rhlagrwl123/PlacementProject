package com.cg.user.service;

import com.cg.user.entities.User;

public interface IUserService {
	User addNewUser(User user);
	User updateUser(User user);
	User login(User user);
	boolean logOut();

}
