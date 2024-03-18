package com.learning.mobileappws.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class LogTemplate {
    private static final Logger logger = LoggerFactory.getLogger(LogTemplate.class);

    private long entryTimestamp;
    private long exitTimestamp;
    private String sourceCallerComponent;
    private String calledComponent;
    private String userInformation;
    private String correlationId;
    private long executionTime;

    public LogTemplate(String sourceCallerComponent, String calledComponent, String userInformation) {
        this.entryTimestamp = System.currentTimeMillis();
        this.sourceCallerComponent = sourceCallerComponent;
        this.calledComponent = calledComponent;
        this.userInformation = userInformation;
        this.correlationId = generateCorrelationId();
    }

    public void setExitTimestamp() {
        this.exitTimestamp = System.currentTimeMillis();
        this.executionTime = exitTimestamp - entryTimestamp;
    }

    public void log() {
        logger.info("Entry Timestamp: {}", entryTimestamp);
        logger.info("Exit Timestamp: {}", exitTimestamp);
        logger.info("Source Caller Component: {}", sourceCallerComponent);
        logger.info("Called Component: {}", calledComponent);
        logger.info("User Information: {}", userInformation);
        logger.info("Correlation ID: {}", correlationId);
        logger.info("Execution Time: {} ms", executionTime);
    }

    private String generateCorrelationId() {
        return UUID.randomUUID().toString();
    }
}
