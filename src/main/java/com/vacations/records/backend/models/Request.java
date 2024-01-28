package com.vacations.records.backend.models;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.vacations.records.backend.enums.RequestStatus;
import com.vacations.records.backend.enums.RequestType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "requests")
public class Request {

	@Id
	@Column(name = "id", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="creatorId", referencedColumnName="id")
	private Employee creatorId;
	@ManyToOne
	@JoinColumn(name="approvedById", referencedColumnName="id")
	private Employee approvedById;
	@Column(name = "reason", length = 500)
	private String reason;
	@Column(name = "type")
	private RequestType type;
	@Column(name = "status")
	private RequestStatus status;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "startDate")
	private Date startDate;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "endDate")
	private Date endDate;

	public Request() {
	}

	public Request(int id, Employee creatorId, Employee approvedById, String reason, RequestType type, RequestStatus status, Date startDate, Date endDate) {
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
