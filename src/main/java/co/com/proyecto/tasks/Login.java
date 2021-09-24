package co.com.proyecto.tasks;

import co.com.proyecto.model.WebsiteData;
import co.com.proyecto.userinterface.PageMapeo;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
    private List<WebsiteData> websiteData;

    public Login(List<WebsiteData> websiteData) {
        this.websiteData = websiteData;
    }

    public static Login Thepage(List<WebsiteData> websiteData) {
        return Tasks.instrumented(Login.class,websiteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(websiteData.get(0).getUser()).into(PageMapeo.USER_NAME),
                Enter.theValue(websiteData.get(0).getPassword()).into(PageMapeo.PASSWORD), Click.on(PageMapeo.SIGN_IN));

    }
}
