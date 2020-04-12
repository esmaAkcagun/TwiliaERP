package com.twiliaerp.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports",
                  "rerun:targert/rerun.text"},
        features = "src/test/resources/features/",
        glue = "com/twiliaerp/StepDefs/",
        dryRun = false,
        tags = "@wip"


)
public class CukesRunner {
}
