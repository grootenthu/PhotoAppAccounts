package com.photoapp.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
	
	@GetMapping (path = "/accounts/status")
	public String status( ) {
		return "Up & Running";
	}

}
