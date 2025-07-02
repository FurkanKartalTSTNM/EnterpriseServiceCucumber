package com.api.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;

public class Hooks {
    private static final Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void beforeScenario(Scenario scenario) {
        logger.info("Starting scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        logger.info("Finished scenario: " + scenario.getName());
        logger.info("Status: " + scenario.getStatus());
    }
}
