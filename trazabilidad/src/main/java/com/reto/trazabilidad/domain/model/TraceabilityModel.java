package com.reto.trazabilidad.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TraceabilityModel {
    private Long id;
    private Long idOrder;
    private Long idClient;
    private String emailClient;
    private Date date;
    private State previousState;
    private State newState;
    private Long idEmployee;
    private String emailEmployee;
}
