package com.pegasus.mechanic.infrastructure.adapter.inbound.controller.dto;

public class MecanicResponseDTO {
	
	private Integer id;
	
	private String name;
	
	private String lastName;
	
	private int experienceYears;
	
	private VehicleTypeDTO vehicleType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public VehicleTypeDTO getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleTypeDTO vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
	
	

}
