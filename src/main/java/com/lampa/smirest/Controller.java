package com.lampa.smirest;

import lombok.extern.slf4j.Slf4j;
import org.buildobjects.process.ProcBuilder;
import org.buildobjects.process.ProcResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class Controller {
    @GetMapping("/load")
    private Long getLoad() {
        try {
            // get summary gpu load
            ProcResult procResult = new ProcBuilder("nvidia-smi", "--query-gpu=utilization.gpu", "--format=csv")
                    .withTimeoutMillis(TimeUnit.SECONDS.toMillis(100))
                    .run();

            String[] result = new String(procResult.getOutputBytes()).split("\n");

            return Long.valueOf(result[1].replace("%", "").trim());
        } catch (Exception ex) {
            log.error("Error get GPU load {}", ex.getMessage());
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY);
        }
    }
}
