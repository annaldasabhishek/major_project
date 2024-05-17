package Runner_file;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

  @CucumberOptions(features =    {"feature"},
                   glue     =    {"Step_Definition"},
                   plugin   =    { "pretty","html:target/cucumber-reports",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 
                  tags="@abhishek",
                  monochrome = true )
 
public class fb_Run extends AbstractTestNGCucumberTests
{

}
