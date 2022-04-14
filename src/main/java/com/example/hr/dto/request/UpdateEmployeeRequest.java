package com.example.hr.dto.request;

import javax.validation.constraints.NotBlank;

import com.example.hr.document.Department;

public class UpdateEmployeeRequest {

	@NotBlank
	private String fullname;
	private double salary;
	private String iban;
	private Boolean fulltime;
	private int birthYear;
	private String photo;
	private Department department;
}
