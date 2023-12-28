package com.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.repository.AccountBalanceRepository;

@Service
public class AccountBalanceService {

	@Autowired
	AccountBalanceRepository accountBalanceRepository;
	

	
}
