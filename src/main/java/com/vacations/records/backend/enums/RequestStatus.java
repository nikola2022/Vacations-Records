package com.vacations.records.backend.enums;

public enum RequestStatus {
	requestStatusAccepted("accepted"), requestStatusDenied("denied");

	private final String name;

	private RequestStatus(String status) {
		name = status;
	}

	public String toString() {
		return this.name;
	}
}
