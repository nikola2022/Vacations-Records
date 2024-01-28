package com.vacations.records.backend.dto;

import java.sql.Date;

import com.vacations.records.backend.enums.RequestStatus;
import com.vacations.records.backend.enums.RequestType;
import com.vacations.records.backend.models.Employee;

public class RequestDTO {

	private int id;
	private Employee creatorId;
	private Employee approvedById;
	private String reason;
	private RequestType type;
	private RequestStatus status;
	private Date startDate;
	private Date endDate;

	public RequestDTO() {
	}

	public RequestDTO(int id, Employee creatorId, Employee approvedById, String reason, RequestType type, RequestStatus status,
			Date startDate, Date endDate) {
		super();
		this.id = id;
		this.creatorId = creatorId;
		this.approvedById = approvedById;
		this.reason = reason;
		this.type = type;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Employee creatorId) {
		this.creatorId = creatorId;
	}

	public Employee getApprovedById() {
		return approvedById;
	}

	public void setApprovedById(Employee approvedById) {
		this.approvedById = approvedById;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public RequestType getType() {
		return type;
	}

	public void setType(RequestType type) {
		this.type = type;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
