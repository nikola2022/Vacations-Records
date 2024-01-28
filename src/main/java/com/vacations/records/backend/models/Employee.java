package com.vacations.records.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "id", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "email", length = 255)
	private String email;
	@Column(name = "first_name", length = 255)
	private String firstName;
	@Column(name = "last_name", length = 255)
	private String lastName;
	@Column(name = "password", length = 255)
	private String password;

	public Employee() {
	}

	public Employee(int id, String email, String firstName, String lastName, String password) {
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
