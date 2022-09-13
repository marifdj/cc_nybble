package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.RickAndMortySteps;

public class RickAndMortyDefinitions {
    RickAndMortySteps steps = new RickAndMortySteps();
    public String url ="https://rickandmortyapi.com/api/character/";

    @When("check character status code {string} {string}")
    public void checkCharacterStatusCode(String id, String status) {steps.checkApiStatus(url, id,status);}

    @Then("check character name {string} {string}")
    public void checkCharacterName(String id, String name){
        steps.checkApiName(url, id, name);
    }
}
