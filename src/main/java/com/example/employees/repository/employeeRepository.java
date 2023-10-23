package com.example.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employees.entity.employeeEntity;

@Repository
public interface employeeRepository extends JpaRepository<employeeEntity, String>
{
	
}
