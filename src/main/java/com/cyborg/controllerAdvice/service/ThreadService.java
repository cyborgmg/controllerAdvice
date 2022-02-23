package com.cyborg.controllerAdvice.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.concurrent.Future;

@Service
public class ThreadService {

    @Async("planilhaExecutor")
    public Future<String> execThread(){

        try {
            Thread.sleep(Duration.ofSeconds(5).toMillis());
            return new AsyncResult<String>("OK");
        } catch (InterruptedException e) {
            return new AsyncResult<String>("InterruptedException");
        }

    }
}
