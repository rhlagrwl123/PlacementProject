package com.cg.user.client;
import com.cg.user.entities.User;
import com.cg.user.service.IUserService;
import com.cg.user.service.UserServiceImpl;

	public class client 
	{
		public static void main(String[] args) 
		{
			// Creating an object of all entity files
			User user = new User();
			IUserService service = new UserServiceImpl();
			
			user.setId(3123);
			user.setName("Rahul Agrawal");
			user.setType("Student");
			user.setPassword("Rahul@123");
		
			service.addNewUser(user);
			
			System.out.println("one user entry is completed");
			
			
		}

	}
	
