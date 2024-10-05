package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(long id);

	public Employee updatedEmployee(long id, Employee employee);

	public void deleteEmployee(long id);

}
