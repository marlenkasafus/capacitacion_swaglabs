package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import userinterface.LoginPage;

public class Login implements Task {
    private String user;
    private String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(LoginPage.USERNAME),
                         Enter.theValue(password).into(LoginPage.PASSWORD),
                         Click.on(LoginPage.BUTTON_LOGIN));
    }

    public static Login with(String user, String password) {
        return Tasks.instrumented(Login.class, user, password);
    }
}
