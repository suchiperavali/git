package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature",glue={"Stepdefinition"},monochrome= true,

plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
		)

public class Runnertest {

}
