package com.api.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",
  glue = {"com.api.stepdefs", "com.api.utils"},
  plugin = {
    "pretty",
    "html:target/cucumber-report",
    "json:target/cucumber.json",
    "junit:target/surefire-reports/cucumber.xml"   // <-- JUnit XML buraya yazılır
  },
  monochrome = true
)
public class TestRunner {}
