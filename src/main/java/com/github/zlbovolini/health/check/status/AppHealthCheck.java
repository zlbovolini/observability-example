package com.github.zlbovolini.health.check.status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class AppHealthCheck implements HealthIndicator {

    private final Logger logger = LoggerFactory.getLogger(AppHealthCheck.class);

    @Override
    public Health health() {

        logger.warn("Informações de health check da API foram acessadas");

        return Health.up()
                .withDetail("hello", "Hello World")
                .build();
    }
}
