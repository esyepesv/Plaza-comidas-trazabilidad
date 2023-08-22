package com.reto.trazabilidad.infrastructure.configuration;


import com.reto.trazabilidad.domain.api.ITraceabilityServicePort;
import com.reto.trazabilidad.domain.spi.ITraceabilityPersistencePort;
import com.reto.trazabilidad.domain.usecase.TraceabilityUseCase;
import com.reto.trazabilidad.infrastructure.out.mongodb.adapter.TraceabilityMongodbAdapter;
import com.reto.trazabilidad.infrastructure.out.mongodb.mapper.ITraceabilityEntityMapper;
import com.reto.trazabilidad.infrastructure.out.mongodb.repository.ITraceabilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {



    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityEntityMapper traceabilityEntityMapper;

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort(){
        return new TraceabilityMongodbAdapter(traceabilityRepository, traceabilityEntityMapper);
    }

    @Bean
    public ITraceabilityServicePort traceabilityServicePort(){
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }
}