package com.vacations.records.backend.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vacations.records.backend.dto.RequestDTO;
import com.vacations.records.backend.models.Request;
import com.vacations.records.backend.repositories.RequestRepo;
import com.vacations.records.backend.services.RequestService;

@Service
public class RequestImpl implements RequestService {

	@Autowired
	RequestRepo requestRepo;

	@Override
	public String addRequest(RequestDTO requestDto) {
		Request request = new Request(requestDto.getId(),requestDto.getCreatorId(),requestDto.getApprovedById(), requestDto.getReason(),requestDto.getType(),requestDto.getStatus(),requestDto.getStartDate(),requestDto.getEndDate());
		requestRepo.save(request);
		return request.getReason();
	}
 
	
}
