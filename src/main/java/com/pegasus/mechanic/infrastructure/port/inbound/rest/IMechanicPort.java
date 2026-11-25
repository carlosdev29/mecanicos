package com.pegasus.mechanic.infrastructure.port.inbound.rest;

import java.util.List;

import com.pegasus.mechanic.infrastructure.adapter.inbound.controller.dto.MecanicResponseDTO;

public interface IMechanicPort {
	
	public List<MecanicResponseDTO> getListMecanics();

}
