package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\main\\resources\\Application\\login.feature"},
		glue= {"loginStep"},
		publish=true,     // instead writing this we can define config file in any folder within project
		plugin= {"pretty"}
)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
