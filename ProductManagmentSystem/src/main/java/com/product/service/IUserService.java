package com.product.service;

import java.util.List;

import com.product.entity.User;

public interface IUserService {
	
	public String saveUser(User user);
	
	public List<User> findAllUser();
	
	

}
