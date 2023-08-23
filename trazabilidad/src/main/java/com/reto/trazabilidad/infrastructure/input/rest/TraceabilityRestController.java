package com.reto.trazabilidad.infrastructure.input.rest;

import com.reto.trazabilidad.application.dto.request.TraceabilityRequestDto;
import com.reto.trazabilidad.application.dto.response.TraceabilityResponseDto;
import com.reto.trazabilidad.application.handler.ITraceabilityHandler;
import com.reto.trazabilidad.infrastructure.configuration.security.JwtService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
public class TraceabilityRestController {

    private final ITraceabilityHandler traceabilityHandler;
    private final JwtService jwtService;

    @Operation(summary = "Add a new traceability document")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "document created", content = @Content),
    })
    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody TraceabilityRequestDto requestDto) {
        traceabilityHandler.saveTraceability(requestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Operation(summary = "Get the order´s traceability")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Traceability returned",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = TraceabilityResponseDto.class)))),
    })
    @GetMapping("/order/{idOrder}")
    public ResponseEntity<List<TraceabilityResponseDto>> orderTraceability(@PathVariable Long idOrder,@RequestHeader("Authorization") String authorizationHeader ){
        String token = authorizationHeader.substring("Bearer ".length());
        Long idClient = jwtService.extractId(token);
        return ResponseEntity.ok(traceabilityHandler.getOrderTraceability(idOrder, idClient));
    }

}