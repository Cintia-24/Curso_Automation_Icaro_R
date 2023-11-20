package com.cvprado.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.cvprado.stepDefinitions", "com.cvprado.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}