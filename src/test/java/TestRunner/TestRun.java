package TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Customerr.feature", glue="StepDefinitions", dryRun=false,monochrome=true, plugin= {"pretty","html:test-output"})
	

public class TestRun {
	
	
}
