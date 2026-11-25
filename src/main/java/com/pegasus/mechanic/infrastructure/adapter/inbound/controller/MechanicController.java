package com.pegasus.mechanic.infrastructure.adapter.inbound.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pegasus.mechanic.infrastructure.adapter.inbound.controller.dto.GreetingResponseDto;
import com.pegasus.mechanic.infrastructure.adapter.inbound.controller.dto.MecanicResponseDTO;
import com.pegasus.mechanic.infrastructure.port.inbound.rest.IMechanicPort;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
	
	
	private final IMechanicPort serviceMechanic;

	MechanicController(IMechanicPort serviceMechanic) {
		this.serviceMechanic = serviceMechanic;
	}
	
	@GetMapping(value = "/greetMechanic")
	public ResponseEntity<String> greetingMechanic() {
		String greeting = "Hello world I am mechanic :)";
		return ResponseEntity.ok(greeting);
	}
	
	@GetMapping(value = "/greetMechanicBro")
	public ResponseEntity<GreetingResponseDto>greetingMechanicBro(){
		//GreetingResponseDto greeting = new GreetingResponseDto("");
		return ResponseEntity.ok(new GreetingResponseDto("Hello bro !"));
	}
	
	@GetMapping(value = "/listMechanics")
	public ResponseEntity<List<MecanicResponseDTO>>getListMechanics(){
		return ResponseEntity.ok(this.serviceMechanic.getListMecanics());
	}

}
