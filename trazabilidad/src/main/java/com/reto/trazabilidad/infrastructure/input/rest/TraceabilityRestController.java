package com.reto.trazabilidad.infrastructure.input.rest;

import com.reto.trazabilidad.application.dto.request.TraceabilityRequestDto;
import com.reto.trazabilidad.application.handler.ITraceabilityHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
public class TraceabilityRestController {

    private final ITraceabilityHandler traceabilityHandler;


    @Operation(summary = "Add a new traceability document")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "document created", content = @Content),
    })
    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody TraceabilityRequestDto requestDto) {
        traceabilityHandler.saveTraceability(requestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



    /*

    @Operation(summary = "Get all objects")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All objects returned",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = ObjectResponseDto.class)))),
            @ApiResponse(responseCode = "404", description = "No data found", content = @Content)
    })
    @GetMapping("/")
    public ResponseEntity<List<ObjectResponseDto>> getAllObjects() {
        return ResponseEntity.ok(objectHandler.getAllObjects());
    }

     */


}