package TestRun;
import org.junit.runner.RunWith;
/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//\src\main\java\Feature\login.feature
	features = {""},
	publish = true,
	glue = {"SigninClass"}	
	)
public class TestRss {

}
