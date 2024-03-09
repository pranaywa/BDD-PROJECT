package testFeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"test\\resource\\behaviourFeature"},
		glue = {"testFeature"},
		plugin = {"pretty","html:@target/amazon.html"}
		)
public class RunnerClass extends AbstractTestNGCucumberTests
{

}
