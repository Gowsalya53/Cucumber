package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/product.feature",
                 glue="stepdef",
                 plugin="html:target/htmlreport")

public class RunnerClass {

}
