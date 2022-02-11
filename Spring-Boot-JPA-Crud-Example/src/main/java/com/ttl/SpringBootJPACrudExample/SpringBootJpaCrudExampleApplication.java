package com.ttl.SpringBootJPACrudExample;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import com.ttl.SpringBootJPACrudExample.controller.EmployeeController;
import com.ttl.SpringBootJPACrudExample.dao.EmployeeRepository;
import com.ttl.SpringBootJPACrudExample.model.Employee;
 
@RestController
@EnableAutoConfiguration
public class SpringBootJpaCrudExampleApplication {
 
 @RequestMapping("/")
 String home() {
 return "Hello World Spring Boot!";
 }
 @Autowired
 private EmployeeRepository obj;
 
 @GetMapping ("/employees")
 public List <Employee> getAllEmployees()
 {
 return obj.findAll();
 }
 
 public static void main(String[] args) throws Exception {
 SpringApplication.run(SpringBootJpaCrudExampleApplication.class, args);
 EmployeeController obj=new EmployeeController();
 obj.getAllEmployees();
 obj.home();
 }
 
}