package io.digital.patterns.identity.api.controller;

import io.digital.patterns.identity.api.model.airline.BoardingScan;
import io.digital.patterns.identity.api.service.ScanRepositoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/airline-boarding")
@PreAuthorize(value = "@authorizationChecker.hasReadRoles(authentication)")
@Tag(name="Airline boarding pass scans", description = "Storing and retrieving airline boarding pass scans from repository")
public class AirlineBoardingScanController {

    private final ScanRepositoryService scanRepositoryService;

    public AirlineBoardingScanController(ScanRepositoryService scanRepositoryService) {
        this.scanRepositoryService = scanRepositoryService;
    }

    @GetMapping(path="/{correlationId}")
    @Operation(summary = "Retrieves a list of mrz scans for a given correlation id")
    public List<BoardingScan> getById(@PathVariable @Parameter(description="ID that can link a list of scans",
            required = true) String correlationId) {
        return (List<BoardingScan>) scanRepositoryService.getScans(correlationId, BoardingScan.class);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    @PreAuthorize(value = "@authorizationChecker.hasUpdateRoles(authentication)")
    @Operation(summary = "Creates an Airline boarding pass scan")
    public void create(@RequestBody @Valid @Parameter(description="Airline boarding pass scan object", required = true) BoardingScan mrzScan) {
        scanRepositoryService.create(mrzScan);
    }

}
