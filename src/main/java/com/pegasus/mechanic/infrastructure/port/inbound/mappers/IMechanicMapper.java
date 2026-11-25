package com.pegasus.mechanic.infrastructure.port.inbound.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.pegasus.mechanic.domain.entity.MechanicEntity;
import com.pegasus.mechanic.infrastructure.adapter.inbound.controller.dto.MecanicResponseDTO;

@Mapper(componentModel = "spring")
public interface IMechanicMapper {

	
	List<MecanicResponseDTO>entityToDto(List<MechanicEntity> mechanicEntity);
}
