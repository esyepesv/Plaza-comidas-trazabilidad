package com.reto.trazabilidad.infrastructure.out.mongodb.adapter;

import com.reto.trazabilidad.domain.model.TraceabilityModel;
import com.reto.trazabilidad.domain.spi.ITraceabilityPersistencePort;
import com.reto.trazabilidad.infrastructure.out.mongodb.mapper.ITraceabilityEntityMapper;
import com.reto.trazabilidad.infrastructure.out.mongodb.repository.ITraceabilityRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TraceabilityMongodbAdapter implements ITraceabilityPersistencePort {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Override
    public void saveTraceability(TraceabilityModel traceabilityModel) {
        traceabilityRepository.save(traceabilityEntityMapper.toEntity(traceabilityModel));
    }

    @Override
    public List<TraceabilityModel> getAll() {
        return null;
    }
}
