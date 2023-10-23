package com.example.employees.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employees.entity.employeeEntity;
import com.example.employees.service.employeeService;

@RestController
public class employeeContoller {

	@Autowired
	private employeeService employeeservice;
	
	@GetMapping(path = "/createEmployee/{employeeID}/{employeeName}/{employeeAge}/{employeeDesignation}/{employeeDomain}")
	public employeeEntity createEmployee(@PathVariable String employeeID, @PathVariable String employeeName ,@PathVariable String employeeAge, @PathVariable String employeeDesignation, @PathVariable String employeeDomain) {
		return employeeservice.createEmployee(employeeID,employeeName, employeeAge, employeeDesignation, employeeDomain);
	}
	
	@GetMapping(path = "/showEmployee")
	public Collection<employeeEntity> showEmployee(){
		return employeeservice.showEmployee();
	}
	
//	@PostMapping(path = "/postEmployee")
//	public employeeEntity postEmployee(@RequestBody employeeEntity employee) {
//		return employeeservice.postEmployee(employee);
//	}
	
	@PostMapping(path = "/postEmployee	")
	public String postEmployee(@RequestBody employeeEntity employee) {
		return employeeservice.postEmployee(employee);
	}
	
	@PutMapping(path = "/updateEmployee")
	public employeeEntity updateEmployee(@RequestBody employeeEntity employee){
		return employeeservice.updateEmployee(employee);
	}
	
	@DeleteMapping(path = "/deleteMapping/{employeeID}")
	public String deleteEmployee(@PathVariable String employeeID) {
		employeeservice.deleteEmployee(employeeID);
		return "Deleted";
	}
}
