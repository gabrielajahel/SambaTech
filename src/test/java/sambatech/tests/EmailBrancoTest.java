package sambatech.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/sambatech/features/EmailBranco.feature",
glue = { "" }, monochrome = true, dryRun = false)

public class EmailBrancoTest {

}
