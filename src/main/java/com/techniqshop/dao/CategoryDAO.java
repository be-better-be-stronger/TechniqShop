package com.techniqshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techniqshop.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{

}
