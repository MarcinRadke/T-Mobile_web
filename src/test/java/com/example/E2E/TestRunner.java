package com.example.E2E;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"com/example/E2E"}, monochrome = true, plugin =
        {"pretty", "html:target/cucumber-reports.html"})
public class TestRunner {
}
