package pl.sda.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class MyStepdefs {
    HelloWorld helloWorld;
    String trescPowitania;


    @Given("stworz instancje klasy HelloWorld zostala stworzona")
    public void stworzInstancjeKlasyHelloWorldZostalaStworzona() {
        helloWorld = new HelloWorld();
    }


    @When("jako jezyk wybrano {string}")
    public void jakoJezykWybranoJezyk(String jezyk) {
        trescPowitania = helloWorld.getHelloMessage(jezyk);

    }

    @Then("wyswietlil sie komunikat {string}")
    public void wyswietlilSieKomunikatKomunikat(String komunikat) {
        assertThat(trescPowitania).containsIgnoringCase(komunikat);
    }
}
