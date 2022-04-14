package com.example.hr.application.business;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.example.hr.application.HrApplication;
import com.example.hr.dto.request.HireEmployeeRequest;
import com.example.hr.dto.request.UpdateEmployeeRequest;
import com.example.hr.dto.response.EmployeeResponse;
import com.example.hr.dto.response.FireEmployeeResponse;
import com.example.hr.dto.response.HireEmployeeResponse;

public class StandardHrApplication implements HrApplication{

	@Override
	public HireEmployeeResponse hireEmployee(HireEmployeeRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeResponse updateEmployee(UpdateEmployeeRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FireEmployeeResponse fireEmployee(String identity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeResponse> findEmployees(@Min(0) int page, @Max(25) int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeResponse findEmployeeByIdentity(String identity) {
		// TODO Auto-generated method stub
		return null;
	}

}
