package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;


import com.services.AccountBalanceService;

@RestController
public class AccountBalanceController {

	@Autowired
	AccountBalanceService accountBalanceService;
	
}
