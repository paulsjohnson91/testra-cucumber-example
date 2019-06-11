import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class MyStepdefs {
    @When("^I do some testy stuff$")
    public void iDoSomeTestyStuff() {
        assertThat(2).as("1 plus 1 is 2").isEqualTo(1+1);
    }

    @Then("^my test passes$")
    public void myTestPasses() {
        assertThat(true).as("this should be true").isTrue();
    }
}
