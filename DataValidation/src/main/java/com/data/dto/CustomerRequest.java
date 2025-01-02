package com.data.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

	private int id;

	@NotNull
	@Size(max = 64)
	private String name;
	
	@NotBlank(message = "contact is mandatory")
	private String contact;
	
	@NotBlank(message = "email is mandatory")
	private String email;
	
	private Date dop;
	private boolean isCustomer;
	private double amount;



}
