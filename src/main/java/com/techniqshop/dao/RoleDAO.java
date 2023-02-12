package com.techniqshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techniqshop.entity.Role;

public interface RoleDAO extends JpaRepository<Role, String>{
	
}
