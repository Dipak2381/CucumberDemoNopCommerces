package CucumberDemo.NopCommerces;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by DIPAK on 4/24/2017.
 */
public class MyStepdefs extends BaseTest
{
    @Given("^user already on homepage$")
    public void user_already_on_homepage() {
       openBrowser();
    }

    @When("^I Click on Register$")
    public void I_Click_on_Register() {
        driver.findElement(By.xpath("//div[@class='header']/div/div[2]/div/ul/li/a")).click();
    }

    @Then("^I should be navigate to Register page sucessfully$")
    public void I_should_be_navigate_to_Register_page_sucessfully() {
        //verify if user is navigated to registration page successfully
      Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

    @When("^I select male gender$")
    public void I_select_male_gender() {
       driver.findElement(By.id("gender-male")).click();
    }

    @When("^I enter first name$")
    public void I_enter_first_name() {
        driver.findElement(By.id("FirstName")).sendKeys("Raj");
    }

    @When("^I enter last name$")
    public void I_enter_last_name() {
        driver.findElement(By.id("LastName")).sendKeys("Malhotra");
    }

    @When("^I enter email$")
    public void I_enter_email() {
        driver.findElement(By.id("Email")).sendKeys("Raj_malhotra@yahoo.com");
    }

    @When("^I enter password$")
    public void I_enter_password() {
        driver.findElement(By.id("Password")).sendKeys("D12345");
    }

    @When("^I entr confirm password$")
    public void I_entr_confirm_password() {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("D12345");

    }

    @When("^I click on register button$")
    public void I_click_on_register_button() {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^I should be register succesfully$")
    public void I_should_be_register_succesfully() {
        //verify if user  register  successfully complete
        Assert.assertTrue(driver.getPageSource().contains("completed"));
    }
}
