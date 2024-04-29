package StepDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	// WebDriver driver= new EdgeDriver();
	WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
	@Given("user opens browser")
	public void user_opens_browser() {
		//System.setProperty("webdriver.edge.driver","../../../src/main/resources/Drivers/msedgedriver.exe"); 
		//System.setProperty("webdriver.gecko.driver","../../../src/main/resources/Drivers/geckodriver.exe"); 
		driver.manage().window().maximize();
	}
	@And("^Navigates to (.*) and click on login button")
	public void Navigates_to_total_av_url_and_click_on_login_button(String total_av_url) throws Exception {
		driver.navigate().to(total_av_url);
	
        if(!driver.getTitle().equals("Official Site | TotalAV™ Award-Winning Antivirus Provider")){
        throw new Exception("This is not a home page.The curent page is " + driver.getCurrentUrl());
        } else {
        	System.out.println("Navigated to the home page");
        	driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
        }
	}
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws Exception {

		Boolean login = driver.findElement(By.name("email")).isDisplayed();
		if(!login) {
			throw new Exception("Login form is not displayed.");
		} else {
			System.out.println("Login form is displayed.");
		}
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);	
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(), 'Log in')]")).click();
	}
	@Then("user is navigated to dashboard")
	public void user_is_navigated_to_dashboard() throws Exception {
		Boolean title = driver.getTitle().equals("Total Security - Dashboard");
		if(!title) {
		    assertTrue("User login failed", title);
		} else {
			assertFalse("User logged in", !title);
		}
	}
	@And("close browser")
	public void close_browser() {
		driver.quit();
	}

}




