package com.reto.trazabilidad.application.handler;

import com.reto.trazabilidad.application.dto.request.TraceabilityRequestDto;
import com.reto.trazabilidad.application.dto.response.TraceabilityResponseDto;
import com.reto.trazabilidad.application.exceptions.InvalidUserException;
import com.reto.trazabilidad.application.mapper.ITraceabilityRequestMapper;
import com.reto.trazabilidad.application.mapper.ITraceabilityResponseMapper;
import com.reto.trazabilidad.domain.api.ITraceabilityServicePort;
import com.reto.trazabilidad.domain.model.TraceabilityModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TraceabilityHandler implements ITraceabilityHandler{

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;
    private final ITraceabilityResponseMapper traceabilityResponseMapper;


    @Override
    public void saveTraceability(TraceabilityRequestDto traceabilityRequestDto) {
        traceabilityServicePort.saveTraceability(traceabilityRequestMapper.toModel(traceabilityRequestDto));
    }

    @Override
    public List<TraceabilityResponseDto> getOrderTraceability(Long idOrder, Long idClient) {
        List<TraceabilityModel> orderTraceability = traceabilityServicePort.getOrderTraceability(idOrder);
        if (orderTraceability.get(0).getIdClient().equals(idClient)) {
            return traceabilityResponseMapper.toResponseList(orderTraceability);
        }else throw new InvalidUserException();
    }
}
