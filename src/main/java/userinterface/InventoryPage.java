package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage extends PageObject {
    public static final Target TITLE = Target.the("text title").located(By.className("title"));
}

