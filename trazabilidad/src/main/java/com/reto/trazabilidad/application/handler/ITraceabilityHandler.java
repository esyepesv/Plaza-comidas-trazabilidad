package com.reto.trazabilidad.application.handler;


import com.reto.trazabilidad.application.dto.request.TraceabilityRequestDto;
import com.reto.trazabilidad.application.dto.response.TraceabilityResponseDto;

import java.util.List;

public interface ITraceabilityHandler {

    void saveTraceability(TraceabilityRequestDto traceabilityRequestDto);

    List<TraceabilityResponseDto> getOrderTraceability(Long idOrder, Long idClient);
}