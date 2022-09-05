package com.example.demo.controller;
import com.example.demo.model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.dao.*;

@RestController
public class EmployeeController 
{

	@Autowired
	EmployeeRepo er;

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> firstPage() {
		System.out.println("get@@@@@@@@@@@@@@@@@2");
		return (List<Employee>) er.findAll();
	}

	@DeleteMapping( "/employees/{id}" )
	public void delete(@PathVariable("id") String id) 
	{	
		er.deleteById(id);
	}

	@PostMapping("/employees")
	public Employee create(@RequestBody Employee user) {
		
		er.save(user);
		
		return user;
	}
	
	
	 @PutMapping("/employees/{id}") 
	 public Employee update(@PathVariable("id") String id,@RequestBody Employee user) 
	 { 
		 er.save(user);
	
	     return user;
	 }


}

