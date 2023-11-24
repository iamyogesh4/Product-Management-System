package com.product.service;

import java.util.List;

import com.product.entity.User;
import com.product.entity.UserRole;

public interface IUserRoleService {
	
	
	public String saveUserRole(UserRole userrole);
	
	public List<UserRole> findAllUserRole();

}
