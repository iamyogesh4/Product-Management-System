package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
