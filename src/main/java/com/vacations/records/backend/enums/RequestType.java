package com.vacations.records.backend.enums;

public enum RequestType {
	requestTypeSick("Sick"), requestTypeHoliday("Holiday"), requestTypePaidDayOff("Paid day off");

	private final String name;

	private RequestType(String type) {
		name = type;
	}

	public String toString() {
		return this.name;
	}
}
