package com.techniqshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techniqshop.dao.CategoryDAO;
import com.techniqshop.entity.Category;
import com.techniqshop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}
}
