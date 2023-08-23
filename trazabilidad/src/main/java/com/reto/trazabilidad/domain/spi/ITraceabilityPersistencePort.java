package com.reto.trazabilidad.domain.spi;

import com.reto.trazabilidad.domain.model.TraceabilityModel;

import java.util.List;

public interface ITraceabilityPersistencePort {
    void saveTraceability(TraceabilityModel traceabilityModel);

    List<TraceabilityModel> getAll();

    List<TraceabilityModel> getOrderTraceability(Long idOrder);
}