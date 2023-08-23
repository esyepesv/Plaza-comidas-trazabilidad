package com.reto.trazabilidad.infrastructure.out.mongodb.repository;

import com.reto.trazabilidad.infrastructure.out.mongodb.entity.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, Long> {
    List<TraceabilityEntity> findByIdOrder(Long idOrder);
}
