package com.reto.trazabilidad.domain.usecase;


import com.reto.trazabilidad.domain.api.ITraceabilityServicePort;
import com.reto.trazabilidad.domain.model.TraceabilityModel;
import com.reto.trazabilidad.domain.spi.ITraceabilityPersistencePort;

import java.util.List;

public class TraceabilityUseCase implements ITraceabilityServicePort {

    private final ITraceabilityPersistencePort traceabilityPersistencePort;

    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }


    @Override
    public void saveTraceability(TraceabilityModel traceabilityModel) {
        traceabilityPersistencePort.saveTraceability(traceabilityModel);
    }

    @Override
    public List<TraceabilityModel> getAll() {
        return traceabilityPersistencePort.getAll();
    }
}