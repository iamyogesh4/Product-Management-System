package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.UserRole;

public interface IUserRoleRepository extends JpaRepository<UserRole, Integer> {

}
