package com.luv2code.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

    //Add method to sort by lastName
    public List<Employee> findAllByOrderByLastNameAsc();

    //Add method to sort by firstName
    public List<Employee> findAllByOrderByFirstNameAsc();
	
}
