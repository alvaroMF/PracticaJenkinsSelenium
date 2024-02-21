package steps;
import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.GooglePage;
public class GoogleSteps {

    GooglePage google = new GooglePage();


    @Given("^I am on the Google search page$")
    public void navigateToGoogle(){
        System.out.println("fds");
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        System.out.println("fds");
        google.enterSearchCriteria("Google");
    }

    @And("^click on the search button$")
    public void clickSearchButton(){
        System.out.println("fds");
        google.clickGoogleSearch();
    }

    @Then("^the results match the criteria$")
    public void validateResults(){
        Assert.assertEquals("Texto que Esperamos", google.firstResult());
        System.out.println("fds");
    }
}
