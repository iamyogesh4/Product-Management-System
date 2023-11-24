package com.product.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.UserRole;
import com.product.repo.IUserRepository;
import com.product.repo.IUserRoleRepository;
import com.product.service.IUserRoleService;

@Service
public class UserRoleServiceImpl implements IUserRoleService {

	@Autowired
	private IUserRoleRepository userrolerepo;
	
	@Override
	public String saveUserRole(UserRole userrole) {
		
		//use repo
		UserRole saverole= userrolerepo.save(userrole);
		
		return "UseRole save succefully with Id"+saverole.getRoleId();
	}

	@Override
	public List<UserRole> findAllUserRole() {
		
		//use repo
		List<UserRole> list = userrolerepo.findAll();
		
		
		return  list;
	}

}
