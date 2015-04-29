package rps.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import rps.Outcome;
import rps.Throw;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoundSteps {

    private Throw myThrow;
    private Throw opponentThrow;

    @Given("^I throw a (Rock|Paper|Scissors)$")
    public void i_throw_a(String myThrow) throws Throwable {
        this.myThrow = Throw.valueOf(myThrow.toUpperCase());
    }

    @Given("^my opponent throws a (Rock|Paper|Scissors)$")
    public void my_opponent_throws_a(String opponentThrow) throws Throwable {
        this.opponentThrow = Throw.valueOf(opponentThrow.toUpperCase());
    }

    @Then("^the result of the round is a (Victory|Defeat|Tie)$")
    public void the_result_of_the_round_is_a(String outcome) throws Throwable {
        assertThat(myThrow.against(opponentThrow), is(Outcome.valueOf(outcome.toUpperCase())));
    }


}
