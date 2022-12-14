package com.example.espresso_android_testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "features",
        glue = {"com.example.espresso_android_testing"},
        monochrome = true,
        plugin = { "pretty"} //"html: cucumber-html-reports",
        // "json: cucumber-html-reports/cucumber.json"}
)
public class CucumberRunner {
}