package com.end2end.todo;
import org.junit.runner.RunWith;

import io.cucumber.core.backend.Snippet;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.types.Feature;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/report.html"},
		tags =("@login"),
		monochrome =true,
		snippets  = SnippetType.CAMELCASE
		
		
)
public class RunnerTest {

}
