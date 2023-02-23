package com.techniqshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techniqshop.entity.Order;
import com.techniqshop.service.OrderService;

//@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	OrderService orderService;
	
//	@RequestMapping("/order/checkout")
//	public String checkout() {
//		return "order/checkout";
//	}
	
//	@RequestMapping("/order/list")
//	public String list(Model model, HttpServletRequest request) {
//		String username = request.getRemoteUser();
//		model.addAttribute("orders", orderService.findByUsername(username));
//		return "order/list";
//	}
	@GetMapping("list")
	public List<Order> getListOrdersByUser(HttpServletRequest request){
		String username = request.getRemoteUser();
		List<Order> list = orderService.findByUsername(username);
		return list;
	}
	
//	@RequestMapping("/order/detail/{id}")
//	public String detail(@PathVariable("id") Long id, Model model) {
//		model.addAttribute("order", orderService.findById(id));
//		return "order/detail";
//	}
	@GetMapping("/detail/{id}")
	public Order findById(@PathVariable("id") Long id) {
		return orderService.findById(id);
	}
	
}
