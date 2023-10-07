package StepDefnClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SigninClass {
	WebDriver driver;
	@Given("user navigates to facebook website")
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Downloads/chromedriver-win64 (1)/chromedriver-win64.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://facebook.com");
	}

	@Then("user enters the emailId as (.*)")
	public void enterEmailId(String emailId) {
		driver.findElement(By.id("email")).sendKeys(emailId);
	}

	@Then("user enters the password as (.*)")
	public void enterPassword(String password) {
		driver.findElement(By.id("pass")).sendKeys("k26711474");
	}

	@Then("user clicks on login button")
	public void click_login_button() {
		driver.findElement(By.id("u_0_2")).click();

	}

	@Then("user logged in successfully")
	public void verifyLoginIsSuccessful() {
		System.out.println("Logged in successful");
	}

	@And("user closes the browser")
	public void closeBrowser() {
		driver.quit();
	}
    }


	



