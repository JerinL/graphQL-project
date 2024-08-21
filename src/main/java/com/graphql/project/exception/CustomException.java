package com.graphql.project.exception;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

@Slf4j
public class CustomException extends RuntimeException {


    public CustomException(String message) {
        super(message);
        log.error("ProductNotFoundException: {}", message); // Log the error
    }
}
