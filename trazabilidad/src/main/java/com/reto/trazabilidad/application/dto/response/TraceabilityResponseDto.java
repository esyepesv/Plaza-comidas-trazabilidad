package com.reto.trazabilidad.application.dto.response;

import com.reto.trazabilidad.domain.model.State;
import lombok.Data;

import java.util.Date;

@Data
public class TraceabilityResponseDto {
    private Long idOrder;
    private Date date;
    private State previousState;
    private State newState;
}
