package com.reto.trazabilidad.infrastructure.out.mongodb.repository;

import com.reto.trazabilidad.infrastructure.out.mongodb.entity.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, Long> {
}
