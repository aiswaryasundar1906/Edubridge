package TestRunCode;

import org.junit.runner.RunWith;
/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/main/java/Feature/login.feature"},
	publish = true,
	glue = {"SigninClass"}	
	)

public class CodeRunPrgm {

}
