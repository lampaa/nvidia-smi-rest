package com.lampa.smi.rest.services;

import com.lampa.smi.SmiReader;
import com.lampa.smi.dtoV1.GpuType;
import com.lampa.smi.rest.dto.StatsDto;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.xml.stream.XMLStreamException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Service
public class StatsService {
    @Value("${stats.size}")
    private Integer size;

    private Map<String, StatsDto> gpusStats = new HashMap<>();

    @Scheduled(fixedDelayString = "${stats.interval}")
    private void scheduler() throws JAXBException, XMLStreamException {
        for (GpuType gpuType : SmiReader.read().getGpu()) {
            String uuid = gpuType.getUuid();

            StatsDto stats = gpusStats.getOrDefault(uuid, new StatsDto(size));

            stats.getGpuPercent().add(Objects.requireNonNullElse(gpuType.getUtilization().getGpuUtil(), 0));
            stats.getMemPercent().add(Objects.requireNonNullElse(gpuType.getUtilization().getMemoryUtil(), 0));

            stats.getVideoEncode().add(Objects.requireNonNullElse(gpuType.getUtilization().getEncoderUtil(), 0));
            stats.getVideoDecode().add(Objects.requireNonNullElse(gpuType.getUtilization().getDecoderUtil(), 0));

            stats.getMemValue().add(Objects.requireNonNullElse(gpuType.getFbMemoryUsage().getUsed(), 0));

            stats.getGpuTemp().add(Objects.requireNonNullElse(gpuType.getTemperature().getGpuTemp(), 0));
            stats.getMemTemp().add(Objects.requireNonNullElse(gpuType.getTemperature().getMemoryTemp(), 0));

            stats.getFan().add(Objects.requireNonNullElse(gpuType.getFanSpeed(), 0));
            stats.getFps().add(gpuType.getEncoderStats().getAverageFps());

            stats.getVideoClock().add(Objects.requireNonNullElse(gpuType.getClocks().getVideoClock(), 0));
            stats.getMemClock().add(Objects.requireNonNullElse(gpuType.getClocks().getMemClock(), 0));
            stats.getGraphicClock().add(Objects.requireNonNullElse(gpuType.getClocks().getGraphicsClock(), 0));

            gpusStats.put(uuid, stats);
        }
    }

    /**
     * get stats
     *
     * @return StatsDto
     */
    public Map<String, StatsDto> getStats() {
        return gpusStats;
    }

    /**
     * get stats by gpu
     *
     * @return StatsDto
     */
    public StatsDto getStatsByGpuUuid(String uuid) {
        return gpusStats.getOrDefault(uuid, null);
    }
}
