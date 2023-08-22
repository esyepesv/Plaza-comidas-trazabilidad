package com.reto.trazabilidad.application.dto.request;

import com.reto.trazabilidad.domain.model.State;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TraceabilityRequestDto {
    private Long idOrder;
    private Long idClient;
    private String emailClient;
    private Date date;
    private State previousState;
    private State newState;
    private Long idEmployee;
    private String emailEmployee;
}
