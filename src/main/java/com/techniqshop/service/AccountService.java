package com.techniqshop.service;

import java.util.List;

import com.techniqshop.entity.Account;

public interface AccountService {
	Account findById(String username);

	List<Account> getAdministrators();

	List<Account> findAll();
}
