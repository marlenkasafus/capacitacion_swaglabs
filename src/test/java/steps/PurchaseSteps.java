package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.NumberOfProductsQuestion;
import tasks.SelectProduct;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PurchaseSteps {

    @Managed(driver="chrome")
    private WebDriver hisDriver;
    private final Actor actor = Actor.named("swagUser");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(hisDriver));
    }

    @When("^he selects the product \"(.*)\"$")
    public void heSelectTheProduct(String product) {
        actor.attemptsTo(SelectProduct.called(product));
    }

    @Then("^the shopping cart should increase the products to \"(.*)\"$")
    public void theShoppingCartShouldIncreaseTheProductsTo(String numberOfProducts) {
        actor.should(seeThat(NumberOfProductsQuestion.is(), Matchers.equalTo(numberOfProducts)));
    }
}
