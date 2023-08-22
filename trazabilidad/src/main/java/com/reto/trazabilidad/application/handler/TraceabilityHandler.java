package com.reto.trazabilidad.application.handler;

import com.reto.trazabilidad.application.dto.request.TraceabilityRequestDto;
import com.reto.trazabilidad.application.mapper.ITraceabilityRequestMapper;
import com.reto.trazabilidad.domain.api.ITraceabilityServicePort;
import com.reto.trazabilidad.domain.model.TraceabilityModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TraceabilityHandler implements ITraceabilityHandler{

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;


    @Override
    public void saveTraceability(TraceabilityRequestDto traceabilityRequestDto) {
        traceabilityServicePort.saveTraceability(traceabilityRequestMapper.toModel(traceabilityRequestDto));
    }
}
