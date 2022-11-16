package com.example.cucumber;

import com.example.DateHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefs {

    private DateHandler todayis;
    private Boolean result;

    @Given("today is {int}\\/{int}")
    public void today_is(Integer day, Integer month) {
        todayis = new DateHandler(month, day);
    }

    @When("I ask whether it is new year yet")
    public void i_ask_whether_it_is_new_year_yet() {
        result = DateHandler.isNewYear(todayis);

    }

    @Then("I should be told no")
    public void i_should_be_told_no() {
        assertFalse(result);
    }


    @Then("I should be told yes")
    public void iShouldBeToldYes() {
        assertTrue(result);
    }
}
