package com.reto.trazabilidad.infrastructure.out.mongodb.entity;

import com.reto.trazabilidad.domain.model.State;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "traceability")
@Data
public class TraceabilityEntity {
    @Id
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
