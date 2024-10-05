package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee employeeSaved = employeeService.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(allEmployees, HttpStatus.OK);
	}
	
	@GetMapping("/{empid}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("empid") long id ){
		Employee retrievedEmployee = employeeService.getEmployeeById(id);
		return new ResponseEntity<Employee>(retrievedEmployee, HttpStatus.OK);
	}
	
	@PutMapping("/{empid}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("empid") long id, @RequestBody Employee employee ){
		Employee updatedEmployee = employeeService.updatedEmployee(id,employee);
		return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.OK);
	}
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable ("empId") long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

}
