package CucumberDemo.NopCommerces;

/**
 * Created by DIPAK on 4/24/2017.
 */

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = "html:target/CucumberReports",tags = "@SmokeTest1")
public class RunTest
{

}
