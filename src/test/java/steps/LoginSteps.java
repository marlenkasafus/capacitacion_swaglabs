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
    public void configuracionInicial() {
        actor.can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^que el usuario quiere ingresar al sitio web$")
    public void queElUsuarioQuiereIngresarAlSitioWeb() {
        actor.wasAbleTo(Open.browserOn(loginPage));
    }


    @When("^ingresa su usuario \"(.*)\" y su password \"(.*)\"$")
    public void ingresaSuUsuarioYSuPassword(String user, String password) {
        actor.attemptsTo(Login.with(user, password));
    }

    @Then("^puede ver los products disponibles$")
    public void puedeVerLosProductsDisponibles() {
    }
}
