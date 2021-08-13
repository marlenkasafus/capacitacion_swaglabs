package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.InventoryPage;

public class NumberOfProductsQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(InventoryPage.NUMBER_PRODUCTS).viewedBy(actor).resolve();
    }

    public static NumberOfProductsQuestion is() {
        return new NumberOfProductsQuestion();
    }
}
