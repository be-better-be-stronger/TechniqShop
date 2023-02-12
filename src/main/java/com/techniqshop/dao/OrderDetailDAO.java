package com.techniqshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techniqshop.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

}
