package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition {
	WebDriver driver;
	@Given("user is  on homepage")
	public void user_is_on_homepage() {
System.setProperty("webdriver.chrome.driver","C:\\chrome3\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}

	@When("user navigates to Login Page")
	public void user_navigates_to_login_page() {
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[1]")).click();// click on sign in
	}

	@And("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys(username);
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
	}

}
