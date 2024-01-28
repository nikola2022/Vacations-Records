package com.vacations.records.backend.services;

import com.vacations.records.backend.dto.EmployeeDTO;
import com.vacations.records.backend.dto.LoginDTO;
import com.vacations.records.backend.models.Employee;
import com.vacations.records.backend.payload.response.LoginMessage;


public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginMessage loginEmployee(LoginDTO loginDTO);
    
    LoginMessage logoutEmployee();
    
    Employee getCurrentUser();

}
