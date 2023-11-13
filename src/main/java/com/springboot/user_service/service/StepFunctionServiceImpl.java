package com.springboot.user_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StepFunctionServiceImpl implements StepFunctionService {

    @Override
    public void startStepFunction() {
        log.info("---> StepFunctionServiceImpl: startStepFunction: step function started...");

        //TODO: this is mock - move it to Step Function
        simulateProcessing(10);

        //TODO: this is mock - move it to Step Function
        log.info("---> StepFunctionServiceImpl: startStepFunction: initialize file deletion...");
    }


    private void simulateProcessing(int seconds) {
        try {
            for (int i = 0; i < seconds; i++) {
                log.info((seconds - i) + "...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
