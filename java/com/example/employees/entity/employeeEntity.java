package com.example.employees.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Id;

@Entity
@Table(name = "Employees")
public class employeeEntity {
	
	@Id
	@Column(name = "employeeID")
	private String employeeID;
	
	@Column(name = "employeeName")
	private String employeeName;
	
	@Column(name = "employeeAge")
	private String employeeAge;
	
	@Column(name = "employeeDesignation")   
	private String employeeDesignation;
	
	@Column(name = "employeeDomain")
	private String employeeDomain;
	
	public employeeEntity() {
		
	}

	public employeeEntity(String employeeID, String employeeName, String employeeAge, String employeeDesignation,
			String employeeDomain) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeDesignation = employeeDesignation;
		this.employeeDomain = employeeDomain;
	}

	public employeeEntity(String employeeName, String employeeAge, String employeeDesignation, String employeeDomain) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeDesignation = employeeDesignation;
		this.employeeDomain = employeeDomain;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeDomain() {
		return employeeDomain;
	}

	public void setEmployeeDomain(String employeeDomain) {
		this.employeeDomain = employeeDomain;
	}
	
	@Override
	public String toString() {
		return "employeeEntity [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeAge="
				+ employeeAge + ", employeeDesignation=" + employeeDesignation + ", employeeDomain=" + employeeDomain
				+ "]";
	}
}
