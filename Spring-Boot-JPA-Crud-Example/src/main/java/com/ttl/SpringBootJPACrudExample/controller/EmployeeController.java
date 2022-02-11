package com.ttl.SpringBootJPACrudExample.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttl.SpringBootJPACrudExample.dao.EmployeeRepository;
import com.ttl.SpringBootJPACrudExample.model.Employee;


@RestController
public class EmployeeController {

@Autowired
private EmployeeRepository obj;

@RequestMapping("/")
public
String home() {
return "Hello TTL Employee -- Spring Boot!";
}

 @GetMapping ("/employees")
public List <Employee> getAllEmployees()
{
return obj.findAll();
}

}