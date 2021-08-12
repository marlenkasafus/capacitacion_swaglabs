package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Login;
import userinterface.LoginPage;

public class LoginSteps {
    @Managed(driver="chrome")
    private WebDriver hisDriver;
    private Actor actor = Actor.named("swagUser");
    private LoginPage loginPage;

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(hisDriver));
    }
    @Given("^that the user wants to enter the website$")
    public void thatTheUserWantsToEnterTheWebsite() {
        actor.wasAbleTo(Open.browserOn(loginPage));
    }

    @When("^he enters his username \"(.*)\" and his password \"(.*)\"$")
    public void heEntersHisUsernameAndHisPassword(String username, String password) {
        actor.attemptsTo(Login.with(username, password));
    }

    @Then("^he can see \"(.*)\" on the main screen$")
    public void heCanSeeOnTheMainScreen(String title) {

    }

}
