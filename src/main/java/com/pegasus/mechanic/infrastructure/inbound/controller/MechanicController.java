package com.pegasus.mechanic.infrastructure.inbound.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pegasus.mechanic.infrastructure.inbound.controller.dto.GreetingResponseDto;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
	
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

}
