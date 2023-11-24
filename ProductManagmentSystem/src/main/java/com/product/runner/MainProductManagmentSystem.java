package com.product.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.product.entity.UserRole;
import com.product.serviceImpl.UserRoleServiceImpl;
import com.product.serviceImpl.UserServiceImpl;

@Component
public class MainProductManagmentSystem implements CommandLineRunner {

	@Autowired
	private UserServiceImpl userservice;
	
	@Autowired
	private UserRoleServiceImpl userroleservice;
	
	@Override
	public void run(String... args) throws Exception {
		
		try 
		{
			
			//register role
			
			UserRole role1 = new UserRole(null,"seller","I'm seller");
			
			userroleservice.saveUserRole(role1);
			
			
			
			
			
			
		}
		catch (Exception e) {
		  
			e.printStackTrace();
		}
		
	}

}
