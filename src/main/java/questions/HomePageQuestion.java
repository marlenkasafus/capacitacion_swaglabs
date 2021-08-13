package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.InventoryPage;

public class HomePageQuestion implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(InventoryPage.TITLE).viewedBy(actor).resolve();
    }

    public static HomePageQuestion getTitle() {
        return new HomePageQuestion();
    }


}
