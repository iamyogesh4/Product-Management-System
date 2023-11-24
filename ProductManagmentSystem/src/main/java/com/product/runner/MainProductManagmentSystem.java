package com.product.runner;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.product.entity.User;
import com.product.entity.UserRole;
import com.product.serviceImpl.UserRoleServiceImpl;
import com.product.serviceImpl.UserServiceImpl;

@Component
public class MainProductManagmentSystem implements CommandLineRunner {

	@Autowired
	private UserServiceImpl userservice;
	
	@Autowired
	private UserRoleServiceImpl userroleservice;
	
	
	private Date date ;
	
	@Override
	public void run(String... args) throws Exception {
		
		try 
		{
			
			//register role
			
			
			  UserRole role1 = new UserRole(null,"seller","I'm seller");
			  
			  userroleservice.saveUserRole(role1);
			 
			
			  //register user
			  
			   User user1 = new User();
			   
			   date = new Date(14, 1, 2000);
			   
			   user1.setAddress("Pune");
			   user1.setBalance(1000.00);
			   
			   user1.setDob(date);
			   
			   user1.setEmailId("yogeshgawali141@gmail.com");
			   
			   user1.setFirstName("Yogesh");
			   
			   user1.setLastName("Gawali");
			   
			   user1.setMobileNo("9130976605");
			   
			   user1.setPassword("Spark@123");
			   
			   user1.setUserId(null);
			   
			   user1.setUserrole(role1);
			   
			   userservice.saveUser(user1);
			   
			
			
			
		
			
			
			
		}
		catch (Exception e) {
		  
			e.printStackTrace();
		}
		
	}

}
