package com.cg.placement.service;

import com.cg.placement.entities.User;
import com.cg.placement.repository.UserRepositoryImpl;
import com.cg.placement.repository.IUserRepository;


public class UserServiceImpl implements IUserService {
      	//Step 1 : Establishing connection b/w service and Repo
	private IUserRepository dao;
	
	
	public UserServiceImpl() {
		dao = new UserRepositoryImpl();
	}
		// Step 2 : service calls for CRUD operations
	
	public User addNewUser(User user) {
		dao.beginTransation();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	public User updateUser(User user) {
		dao.beginTransation();
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
