package com.vacations.records.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vacations.records.backend.dto.RequestDTO;
import com.vacations.records.backend.services.RequestService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/requests")
public class RequestController {
	@Autowired
	RequestService requestService;

	@PostMapping(path = "/add")
	public String saveRequest(@RequestBody RequestDTO requestDto) {
		String id = requestService.addRequest(requestDto);
		return id;
	}
}
