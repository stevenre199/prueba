package co.com.proyecto.stepdefinitions;

import co.com.proyecto.model.WebsiteData;
import co.com.proyecto.questions.Queryy;
import co.com.proyecto.tasks.Bussines;
import co.com.proyecto.tasks.Login;
import co.com.proyecto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;


public class WebsiteStepdefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user open website$")
    public void theUserOpenWebsite() {

        OnStage.theActorCalled("Steven").wasAbleTo(OpenUp.thePage());
    }

    @And("^than steven login in the website,take a click for the logged successfully$")
    public void thanStevenLoginInTheWebsiteTakeAClickForTheLoggedSuccessfully(List<WebsiteData> WebsiteData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.Thepage(WebsiteData));
    }

    @When("^create a new unit of business and take a information with the company,and firts take aclick in bottom name organization and later take a click in meeting and third meetings$")
    public void createANewUnitOfBusinessAndTakeAInformationWithTheCompanyAndFirtsTakeAclickInBottomNameOrganizationAndLaterTakeAClickInMeetingAndThirdMeetings(List<WebsiteData> WebsiteData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Bussines.meeting(WebsiteData));
    }

    @Then("^meeting successfully$")
    public void meetingSuccessfully(List<WebsiteData> WebsiteData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Queryy.idd(WebsiteData), Matchers.equalTo(WebsiteData.get(0).getIdMeeting())));



    }
}
