package com.data.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.dto.CustomerRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/root")
public class CustomerController {
	
	@PostMapping("/test")
	public CustomerRequest test(@Valid @RequestBody CustomerRequest customerRequest) {	
		
		return customerRequest;
	}

}
