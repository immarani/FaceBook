package facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\facebook.feature",
					glue= "facebook",
					tags = "@create",
					plugin = "html:target/html",
					monochrome = true,
					dryRun = false)
public class TestRunner {

}

