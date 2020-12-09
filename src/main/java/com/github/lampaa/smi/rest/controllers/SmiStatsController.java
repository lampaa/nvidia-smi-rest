package com.github.lampaa.smi.rest.controllers;

import com.github.lampaa.smi.rest.dto.StatsDto;
import com.github.lampaa.smi.rest.services.StatsService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import java.io.IOException;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/stats")
public class SmiStatsController {
    @Autowired
    private StatsService statsService;

    @Value("${stats.enable}")
    private Boolean enable;

    @Value("file:resources/graphs.html")
    private Resource graphs;

    @GetMapping
    @ApiResponse(description = "Get all gpu stats")
    private Map<String, StatsDto> getAll() {
        if (!enable) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "stats disabled");
        }

        return statsService.getStats();
    }

    @GetMapping("{gpu_uuid}")
    @ApiResponse(description = "Get stats by gpu")
    private StatsDto getByGpuUuid(@PathVariable String gpu_uuid) {
        if (!enable) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "stats disabled");
        }

        return statsService.getStatsByGpuUuid(gpu_uuid);
    }

    @GetMapping("graphs")
    @ApiResponse(description = "Get HTML graphics")
    private ResponseEntity getGraphs() throws IOException {
        if (!enable) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "stats disabled");
        }

        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.setContentLength(graphs.contentLength());
        return new ResponseEntity<>(graphs, httpHeaders, HttpStatus.OK);
    }
}
