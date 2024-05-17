package Step_Definition;
import java.io.IOException;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import All_login_page.page_value;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utliles.Generic_methods;
public class loginstep_D  extends page_value
{  
      	     Generic_methods GM= new Generic_methods();
      	
            @Given("user is on login page")
            public void user_is_on_login_page() throws IOException
            {
            	Browser_launch();
            	ExtentCucumberAdapter.addTestStepLog("Lanuched successfully");
        		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
            }
            
            @When("user enters valid username \"([^\"]*)\"$")
            public void user_enters_valid_username(String username) throws IOException 
            {
            	enter_emailid(username);
            	ExtentCucumberAdapter.addTestStepLog("Entered username successfully "+username);
        		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
            	
            }

            @When("user enters valid password \"([^\"]*)\"$")
            public void user_enters_valid_password(String password) throws IOException 
            {
            	enter_password(password);
            	ExtentCucumberAdapter.addTestStepLog("Entered username successfully "+password);
        		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
            }

            @Then("clicks on submit")
            public void clicks_on_submit()
            {
            	login();
            	ExtentCucumberAdapter.addTestStepLog("clicked successuly");
            }
            
  
           /* @When("user enters valid username {string}")
            public void user_enters_valid_username(String username) 
            {
            	enter_emailid(username);
            }

            @When("user enters valid password {string}")
            public void user_enters_valid_password(String password) 
            {
            	enter_password(password);
            }

            @Then("clicks on submit")
            public void clicks_on_submit()
            {
            	login();	
            }
               */
}
