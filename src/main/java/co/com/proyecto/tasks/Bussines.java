package co.com.proyecto.tasks;

import co.com.proyecto.model.WebsiteData;
import co.com.proyecto.userinterface.PageMapeo;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Bussines implements Task {
    private List<WebsiteData> websiteData;

    public Bussines(List<WebsiteData> websiteData) {
        this.websiteData = websiteData;

    }


    public static Bussines meeting(List<WebsiteData> websiteData) {
        return Tasks.instrumented(Bussines.class,websiteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageMapeo.ORGANIZATION),Click.on(PageMapeo.BUSINESS_UNIT),
                Click.on(PageMapeo.NEW_BUSINESS),
                Enter.theValue(websiteData.get(0).getNameBusiness()).into(PageMapeo.NAME_BUSINESS),
                Click.on(PageMapeo.SAVE_NEWBUS), Click.on(PageMapeo.MEETING_ON),Click.on(PageMapeo.MEETING),
                Click.on(PageMapeo.NEW_MEETING),
                Enter.theValue(websiteData.get(0).getMeetingName()).into(PageMapeo.MEETING_NAME),
                Click.on(PageMapeo.CAL_START), Click.on(PageMapeo.MES), Click.on(PageMapeo.AÑO),
                Click.on(PageMapeo.DIA), Click.on(PageMapeo.HORA), Click.on(PageMapeo.END_DATE),
                Click.on(PageMapeo.MES_END),Click.on(PageMapeo.AÑO_END), Click.on(PageMapeo.DIA_END),
                Click.on(PageMapeo.HORA_END), Click.on(PageMapeo.CLICK), Click.on(PageMapeo.CLICK_ON),
                Click.on(PageMapeo.SAVE_MEETING)


                 );







    }
}

