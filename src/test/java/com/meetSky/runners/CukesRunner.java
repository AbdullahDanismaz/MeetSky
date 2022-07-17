package com.meetSky.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
    },
        features = "src/test/resources/features",
        glue = "com/meetSky/step_definitions",
        dryRun = false,
        tags = "@MESK-265",
        publish = false

)
public class CukesRunner {
    }


