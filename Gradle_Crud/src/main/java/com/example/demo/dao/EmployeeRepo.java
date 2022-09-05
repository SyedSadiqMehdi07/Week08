package com.example.demo.dao;
import com.example.demo.model.Employee;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepo extends CrudRepository<Employee,String>
{
	

}
