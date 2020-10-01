
package com.employee.controller;
import static net.logstash.logback.argument.StructuredArguments.kv;


import org.slf4j.LoggerFactory;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.fasterxml.jackson.databind.util.JSONPObject;

import net.logstash.logback.argument.StructuredArgument;

import static net.logstash.logback.argument.StructuredArguments.kv;
import java.util.Iterator; 
import java.util.Map; 
import java.io.FileReader;

import org.apache.tomcat.util.json.JSONParser;

@RestController

public class EmployeeController {
	
	public org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	private String employeeid;
	
	@GetMapping("/health")
	public String getHealth() {
		logger.info("{} invoked...", this.getClass().getName());
		return "Server is running...!";
	}
	
	
	@GetMapping("/user")
	public String getUser() {
		Employee emp = new Employee(123,"aathi","banglore");
		logger.info(emp.toString());
		
				return emp.toString();
	}
@GetMapping("/userinfo")
public StructuredArgument User() {
	String employeeid = "123";
	logger.info("employeeid{}",kv("employee",employeeid));
	return kv ("employee",employeeid);
    
	
}
}
  