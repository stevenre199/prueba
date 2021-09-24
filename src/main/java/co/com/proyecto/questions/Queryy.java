package co.com.proyecto.questions;

import co.com.proyecto.model.WebsiteData;
import co.com.proyecto.userinterface.PageMapeo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Queryy implements Question<String> {

    private List<WebsiteData> websiteData;

    public Queryy (List<WebsiteData> websiteData){
        this.websiteData = websiteData;
    }


    public static Queryy idd(List<WebsiteData> WebsiteData) {
        return new Queryy(WebsiteData);
    }



    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PageMapeo.ID_MEETING).viewedBy(actor).asString();
    }
}
