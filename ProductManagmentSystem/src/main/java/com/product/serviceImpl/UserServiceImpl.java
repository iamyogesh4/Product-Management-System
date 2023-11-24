package com.product.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.User;
import com.product.repo.IUserRepository;
import com.product.service.IUserService;

@Service
public class UserServiceImpl  implements IUserService{

	@Autowired
	private IUserRepository userrepo;
	
	@Override
	public String saveUser(User user) {
		
		//use repo
		
		User saveuse = userrepo.save(user);
		
		return "User save succefully with Id"+saveuse.getUserId();
	}

	@Override
	public List<User> findAllUser() {
		
		//use repo
		
		List<User> list = userrepo.findAll();
		
		return list;
	}

}
