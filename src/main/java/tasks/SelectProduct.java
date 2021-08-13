package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.InventoryPage;

public class SelectProduct implements Task {

    private String product;

    public SelectProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InventoryPage.PRODUCT.of(product)),
                Click.on(InventoryPage.ADD_TO_CART));
    }

    public static Performable called(String product) {
        return Tasks.instrumented(SelectProduct.class, product);
    }
}
