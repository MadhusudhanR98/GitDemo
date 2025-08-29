package StepDefinition;

import io.cucumber.java.en.*;


import java.util.List;

public class LoginSteps {

    @Given("User opens the application url")
    public void user_opens_the_application_url() {
        System.out.println("application url opened");
    }

    @When("user enters the email id and password")
    public void userEntersTheEmailIdAndPassword() {
        System.out.println("entered email & password");

    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("clicked on login button");

    }

    @Then("home page should be displayed")
    public void homePageShouldBeDisplayed() {
        System.out.println("homepage is displayed");

    }

    @When("user enters the email {string} and {string}")
    public void userEntersTheEmailAnd(String id, String pass) {
        System.out.println("email id is " + id + " and password is " + pass);

    }
    @When("user enters the")
    public void user_enters_the(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
    }

    @Given("open the browser")
    public void openTheBrowser() {
        System.out.println("browser opened");
    }

    @When("user enter the url")
    public void userEnterTheUrl() {
        System.out.println("*********************");
    }

    @Then("login page is displayed")
    public void loginPageIsDisplayed() {


    }
}
