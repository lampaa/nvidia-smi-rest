package com.lampa.smi.rest.controllers;

import com.lampa.smi.rest.dto.StatsDto;
import com.lampa.smi.rest.services.StatsService;
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
    private Map<String, StatsDto> getAll() {
        if (!enable) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "stats disabled");
        }

        return statsService.getStats();
    }

    @GetMapping("graphs")
    private ResponseEntity getGraphs() throws IOException {
        if (!enable) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "stats disabled");
        }

        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.setContentLength(graphs.contentLength());
        return new ResponseEntity<>(graphs, httpHeaders, HttpStatus.OK);
    }

    @GetMapping("{uuid}")
    private StatsDto getByGpuUuid(@PathVariable String uuid) {
        if (!enable) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "stats disabled");
        }

        return statsService.getStatsByGpuUuid(uuid);
    }
}
