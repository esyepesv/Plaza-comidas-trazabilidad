package com.reto.trazabilidad.domain.api;


import com.reto.trazabilidad.domain.model.TraceabilityModel;

import java.util.List;

public interface ITraceabilityServicePort {

    void saveTraceability(TraceabilityModel traceabilityModel);

    List<TraceabilityModel> getAll();

    List<TraceabilityModel> getOrderTraceability(Long idOrder);
}