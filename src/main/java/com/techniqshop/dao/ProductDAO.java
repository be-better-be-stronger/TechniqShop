package com.techniqshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techniqshop.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
	@Query("Select p from Product p where p.category.id=?1")
	List<Product> findByCategoryId(String cid);
}
