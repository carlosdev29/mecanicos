package com.pegasus.mechanic.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_mechanic")
public class MechanicEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mechanic")
	private Integer id;
	
	private String name;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "experience_years")
	private Integer experienceYears;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_type_id")
	private VehicleTypeEntity vehicleType;
	
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
	public Integer getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(Integer experienceYears) {
		this.experienceYears = experienceYears;
	}
	public VehicleTypeEntity getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleTypeEntity vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	

}
