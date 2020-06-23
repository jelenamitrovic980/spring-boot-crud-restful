package com.github.springboot.springBootCrudRestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.springboot.springBootCrudRestful.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
