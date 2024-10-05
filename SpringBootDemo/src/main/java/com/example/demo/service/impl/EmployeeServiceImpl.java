package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeRepo.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		
		return employeeRepo.findById(id).get();
	}

	@Override
	public Employee updatedEmployee(long id, Employee employee) {
		
		employeeRepo.findById(id);
		Employee updatedEmployee = employeeRepo.save(employee);
		return updatedEmployee;
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepo.deleteById(id);
		
	}


	
}
