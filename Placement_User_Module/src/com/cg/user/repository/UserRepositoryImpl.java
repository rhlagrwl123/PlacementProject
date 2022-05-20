package com.cg.user.repository;

import javax.persistence.EntityManager;

import com.cg.user.entities.User;

public class UserRepositoryImpl implements IUserRepository{
	//Step 1 : Start JPA LifeCycle
	
		private EntityManager entityManager;

		public UserRepositoryImpl() {
			entityManager  = JPAUtil.getEntityManager();	
			}

	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	public User updateUser(User user) {
		entityManager.merge(user);
		return user;	
		}

	public User deleteUser(int id) {
		User user = entityManager.find(User.class, id);	
		entityManager.remove(user);
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

	public void beginTransaction() {
		entityManager.getTransaction().begin();		
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();		
	}

}
