package com.example.employees.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employees.entity.employeeEntity;
import com.example.employees.repository.employeeRepository;

@Service
public class employeeService {
	
	@Autowired
	private employeeRepository empRepo;
	
	public employeeEntity createEmployee(String employeeId,String employeeName, String employeeAge, String employeeDesignation, String employeeDomain) {
		employeeEntity EntClass = new employeeEntity(employeeId,employeeName,employeeAge,employeeDesignation,employeeDomain);
		empRepo.save(EntClass);
		return EntClass;
	}
	
	public Collection<employeeEntity> showEmployee(){
		return empRepo.findAll();
	}
	
	public String postEmployee(employeeEntity employee) {
		empRepo.save(employee);
		return "Posted";
 	}
	
//	public employeeEntity postEmployee(employeeEntity employee) {
//		employeeEntity emp = empRepo.save(employee);
//		return emp;
// 	}
	
	public employeeEntity updateEmployee(employeeEntity employee) {
		employeeEntity emp = empRepo.getById(employee.getEmployeeID());
		emp.setEmployeeName(employee.getEmployeeName());
		emp.setEmployeeAge(employee.getEmployeeAge());
		emp.setEmployeeDesignation(employee.getEmployeeDesignation());
		emp.setEmployeeDomain(employee.getEmployeeDomain());
		empRepo.save(emp);
		return emp; 
	}
	
	public String deleteEmployee(String EmployeeID) {
		employeeEntity emp = empRepo.getOne(EmployeeID);
		empRepo.delete(emp);
		return "Deleted";
	}
}
