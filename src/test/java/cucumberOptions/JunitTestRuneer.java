package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/Login.feature",
		glue="stepDefinations",stepNotifications=true,plugin= {"pretty","html:target/cucumber.html","json:target/testdemo.json","junit:target/reports.xml"})
public class JunitTestRuneer {

}
