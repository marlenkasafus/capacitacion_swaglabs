package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage extends PageObject {
    public static final Target TITLE = Target.the("text title").located(By.className("title"));
    public static final Target PRODUCT = Target.the("product").locatedBy("//div[text()=\"{0}\"]/..");
    public static final Target ADD_TO_CART = Target.the("button add cart").locatedBy("//button[text()=\"Add to cart\"]");
    public static final Target NUMBER_PRODUCTS = Target.the("products").located(By.className("shopping_cart_badge"));
}

