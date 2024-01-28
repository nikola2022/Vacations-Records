package com.vacations.records.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vacations.records.backend.dto.EmployeeDTO;
import com.vacations.records.backend.dto.LoginDTO;
import com.vacations.records.backend.models.Employee;
import com.vacations.records.backend.payload.response.LoginMessage;
import com.vacations.records.backend.services.EmployeeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path = "/register")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginMessage loginMessage = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }
    @PostMapping(path = "/logout")
    public ResponseEntity<?> logoutEmployee()
    {
        LoginMessage loginMessage = employeeService.logoutEmployee();
        return ResponseEntity.ok(loginMessage);
    }
    @GetMapping(path = "/user")
    public ResponseEntity<?> myAccountDetails() {
    	Employee currentUser = employeeService.getCurrentUser();
    	return ResponseEntity.ok(currentUser);
    }
}
