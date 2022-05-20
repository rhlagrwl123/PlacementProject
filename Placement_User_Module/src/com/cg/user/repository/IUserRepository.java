package com.cg.user.repository;

import com.cg.user.entities.User;
 public interface IUserRepository{
	User addNewUser(User user);
	User updateUser(User user);
	User login(User user);
	boolean logOut();
	void beginTransaction();
	void commitTransaction();
	

}
