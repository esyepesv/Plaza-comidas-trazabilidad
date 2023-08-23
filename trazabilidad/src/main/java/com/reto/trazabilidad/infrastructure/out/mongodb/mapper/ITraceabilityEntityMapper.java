package com.reto.trazabilidad.infrastructure.out.mongodb.mapper;

import com.reto.trazabilidad.domain.model.TraceabilityModel;
import com.reto.trazabilidad.infrastructure.out.mongodb.entity.TraceabilityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityEntityMapper {
    TraceabilityEntity toEntity(TraceabilityModel traceabilityModel);
    TraceabilityModel toTraceability(TraceabilityEntity traceabilityEntity);

    List<TraceabilityModel> toTraceabilityList(List<TraceabilityEntity> traceabilityEntityList);

}
