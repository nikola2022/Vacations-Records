package com.vacations.records.backend.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vacations.records.backend.dto.EmployeeDTO;
import com.vacations.records.backend.dto.LoginDTO;
import com.vacations.records.backend.models.Employee;
import com.vacations.records.backend.payload.response.LoginMessage;
import com.vacations.records.backend.repositories.EmployeeRepo;
import com.vacations.records.backend.services.EmployeeService;

import jakarta.servlet.http.HttpSession;

@Service

public class EmployeImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private HttpSession session;

	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee(employeeDTO.getId(), employeeDTO.getEmail(), employeeDTO.getFirstName(),
				employeeDTO.getLastName(), this.passwordEncoder.encode(employeeDTO.getPassword()));
		employeeRepo.save(employee);
		return employeeDTO.getFirstName();
	}

	EmployeeDTO employeeDTO;

	@Override
	public LoginMessage loginEmployee(LoginDTO loginDTO) {
		Employee employee1 = employeeRepo.findByEmail(loginDTO.getEmail());
		if (employee1 != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = employee1.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if (isPwdRight) {
				Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(),
						encodedPassword);
				if (employee.isPresent()) {
					session.setAttribute("user", employee1);
					if (session.getAttribute("user") != null) {
						return new LoginMessage(session.getAttribute("user").toString(), true);
					} else {
						return new LoginMessage("Login Failed not set session", false);
					}
				} else {
					return new LoginMessage("Login Failed employee not present", false);
				}
			} else {
				return new LoginMessage("Password not match", false);
			}
		} else {
			return new LoginMessage("Email not exits", false);
		}
	}

	@Override
	public LoginMessage logoutEmployee() {
		session.invalidate();
		if (session.getAttribute("user") == null) {
			return new LoginMessage("Logout Succesfully", false);
		} else {
			return new LoginMessage("Logout Failed", true);
		}

	}

	@Override
	public Employee getCurrentUser() {
		Employee user = (Employee) session.getAttribute("user");
		return user;
	}

}
