package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

//Integer
public interface EmployeeDao extends CrudRepository<Employee,String> {

	List<Employee> findByEmpFirstName(String empFirstName);

}
