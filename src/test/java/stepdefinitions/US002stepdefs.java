package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.MedunnaHomePage;
import pages.MedunnaRegisterPage;
import utilities.Driver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US002stepdefs {
    MedunnaRegisterPage medunnaRegisterPage = new MedunnaRegisterPage();
    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    @Given("US002AC01TC01: User leaves the username blank, there should be Your username is required. error message")
    public void us002ac01tc01_user_leaves_the_username_blank_there_should_be_your_username_is_required_error_message() {

    }
    @When("US002AC01TC02: User enters username special chars £#$€, there should be Your username is invalid. error message")
    public void us002ac01tc02_user_enters_username_special_chars_£_$€_there_should_be_your_username_is_invalid_error_message() {

    }
    @When("US002AC01TC03: User enters username  that can contain any chars, there should not be any error message")
    public void us002ac01tc03_user_enters_username_that_can_contain_any_chars_there_should_not_be_any_error_message() {

    }
    @Given("US002AC03TC01: User enters the email as johndoe.com, there should be This field is invalid error message")
    public void us002ac03tc01_user_enters_the_email_as_johndoe_com_there_should_be_this_field_is_invalid_error_message() {

    }
    @When("US002AC03TC02: User enters the email as john@doecom, there should be This field is invalid error message")
    public void us002ac03tc02_user_enters_the_email_as_john_doecom_there_should_be_this_field_is_invalid_error_message() {

    }
    @When("US002AC03TC03: User enters the email as john@doe., there should be This field is invalid error message")
    public void us002ac03tc03_user_enters_the_email_as_john_doe_there_should_be_this_field_is_invalid_error_message() {

    }
    @When("US002AC03TC04: User enters the email as @doe.com, there should be This field is invalid error message")
    public void us002ac03tc04_user_enters_the_email_as_doe_com_there_should_be_this_field_is_invalid_error_message() {

    }
    @Then("US002AC03TC05: User enters the email as john@doe.com, there should not be any error message")
    public void us002ac03tc05_user_enters_the_email_as_john_doe_com_there_should_not_be_any_error_message() {

    }
    @Given("US002AC04TC01: User leaves the email blank, there should be Your email is required. error message")
    public void us002ac04tc01_user_leaves_the_email_blank_there_should_be_your_email_is_required_error_message() {

    }
    @When("US002AC04TC02: User enters the email as john@doe.com, there should not be any error message")
    public void us002ac04tc02_user_enters_the_email_as_john_doe_com_there_should_not_be_any_error_message() {

    }
}