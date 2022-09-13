package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.BasePage;

public class RickAndMortySteps {
    BasePage Base = new BasePage();
    @Step
    public void checkApiStatus(String url, String id, String status) {
        Base.checkStatus(url, id, status);
    }
    @Step
    public void checkApiName(String url, String id, String name){ Base.checkName(url, id, name);
    }
}
