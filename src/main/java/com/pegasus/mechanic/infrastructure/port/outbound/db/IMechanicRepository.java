package com.pegasus.mechanic.infrastructure.port.outbound.db;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pegasus.mechanic.domain.entity.MechanicEntity;

public interface IMechanicRepository extends JpaRepository<MechanicEntity, Integer> {

}
