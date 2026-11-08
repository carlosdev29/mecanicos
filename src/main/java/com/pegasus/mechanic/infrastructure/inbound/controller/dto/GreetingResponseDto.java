package com.pegasus.mechanic.infrastructure.inbound.controller.dto;

public class GreetingResponseDto {
	
	private String greetMechanic;
	
	public GreetingResponseDto(String greet) {
		this.greetMechanic = greet;
	}
	
	public String getGreetMechanic() {
		return this.greetMechanic;
	}

}
