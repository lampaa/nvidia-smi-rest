package com.lampa.smi.rest.dto;

import lombok.Getter;
import org.apache.commons.collections4.queue.CircularFifoQueue;

import java.lang.reflect.Field;
import java.util.Queue;

@Getter
public class StatsDto {
    // percent
    protected Queue<Integer> gpuPercent = null;
    protected Queue<Integer> memPercent = null;
    protected Queue<Integer> memValue = null;

    // video
    protected Queue<Integer> videoEncode = null;
    protected Queue<Integer> videoDecode = null;
    protected Queue<Integer> fps = null;

    // temps
    protected Queue<Integer> gpuTemp = null;
    protected Queue<Integer> memTemp = null;
    protected Queue<Integer> fan = null;

    //
    protected Queue<Integer> graphicClock = null;
    protected Queue<Integer> videoClock = null;
    protected Queue<Integer> memClock = null;

    //protected Queue<Integer> pciTx = null;
    //protected Queue<Integer> pciRx  = null;

    public StatsDto(Integer size) {
        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);

                CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(size);
                for (int i = 0; i < size; i++) {
                    queue.add(0);
                }

                field.set(this, queue);
            } catch (IllegalAccessException e) {
            }
        }
    }
}
