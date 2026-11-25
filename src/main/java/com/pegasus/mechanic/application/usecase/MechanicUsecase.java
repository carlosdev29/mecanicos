package com.pegasus.mechanic.application.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pegasus.mechanic.domain.entity.MechanicEntity;
import com.pegasus.mechanic.infrastructure.adapter.inbound.controller.dto.MecanicResponseDTO;
import com.pegasus.mechanic.infrastructure.port.inbound.mappers.IMechanicMapper;
import com.pegasus.mechanic.infrastructure.port.inbound.rest.IMechanicPort;
import com.pegasus.mechanic.infrastructure.port.outbound.db.IMechanicRepository;


@Service
public class MechanicUsecase implements IMechanicPort {
	
	private final IMechanicRepository mechanicRepository;
	
	private final IMechanicMapper mapper;

	MechanicUsecase(IMechanicRepository mechanicRepository, IMechanicMapper mapper) {
		this.mechanicRepository = mechanicRepository;
		this.mapper = mapper;
	}

	
	@Override
	public List<MecanicResponseDTO> getListMecanics() {
		List<MechanicEntity> mechanicsList = this.mechanicRepository.findAll();
		System.out.println("Lista de mecanicos: "+mechanicsList);
		List<MecanicResponseDTO>listMechanics =this.mapper.entityToDto(mechanicsList);
		return listMechanics;
	}

}
