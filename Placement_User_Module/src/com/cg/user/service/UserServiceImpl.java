package com.cg.user.service;

import com.cg.user.entities.User;
import com.cg.user.repository.IUserRepository;
import com.cg.user.repository.UserRepositoryImpl;


public class UserServiceImpl implements IUserService {
      	//Step 1 : Establishing connection b/w service and Repo
	private IUserRepository dao;
	
	
	public UserServiceImpl() {
		dao = new UserRepositoryImpl();
	}
		// Step 2 : service calls for CRUD operations
	
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

}
