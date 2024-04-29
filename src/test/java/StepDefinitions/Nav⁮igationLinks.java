package StepDefinitions;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nav⁮igationLinks {
	WebDriver driver = new FirefoxDriver();
	Actions actions = null;

	@Given("user open browser") 
	public void user_open_browser() {
		driver.manage().window().maximize();
	}

	@And("navigates to totalAV homepage")
	public void navigates_to_totalAV_homepage() {
		driver.navigate().to("https://www.TotalAV.com/");	
	}

	public void menu_navigation(WebElement mainMenu, WebElement subMenu) throws InterruptedException {
		actions = new Actions(driver);
		actions.moveToElement(mainMenu);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", subMenu);
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		Thread.sleep(5000);	
	}

	//Anti Virus Pro menu item 
	@When("user selects antiviruspro sublink from product main menu")
	public void user_selects_antiviruspro_sublink_from_product_main_menu() throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Product')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/h2[contains(text(), 'Antivirus Pro')]"));
		menu_navigation(mainMenu, subMenu);
	}
	@Then("user navigates to antivirus pro page")
	public void user_navigates_to_antivirus_pro_page () throws Exception {
		WebElement h1 = driver.findElement(By.xpath("//*[contains(@class, 'h1')]"));
		Boolean avpro = h1.getText().equals("Award-Winning, Market-Leading Threat Protection");
		if(!avpro) {
			assertTrue("User did not navigate to antivirus pro page and the current page title is : " + driver.getTitle(), avpro);
		} else {
			assertFalse("User is navigated to antivirus pro page", !avpro);
		}
	}

	//Internet security menu item
	@When("user selects internetsecurity sublink")
	public void user_selects_internetsecurity_sublink() throws InterruptedException {
		WebElement mainMenu= driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Product')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/p[contains(text(), 'Online protection and VPN privacy')]"));
		menu_navigation(mainMenu, subMenu);
	}

	@Then("user navigates to internetsecurity page")
	public void user_navigates_to_internetsecurity_page() throws Exception {
		WebElement h1 = driver.findElement(By.xpath("//*[contains(@class, 'h1')]"));
		Boolean isp = h1.getText().equals("Internet Security & Total Privacy, all-in-one.");
		if(!isp) {
			assertTrue("User did not navigate to internet security page and the current page title is : " + driver.getTitle(), isp);
		} else {
			assertFalse("User is navigated to internet security page", !isp);
		}
	}

	//Antivirus menu item
	@When("user selects antivirus sublink from security main menu")
	public void user_selects_antivirus_sublink_from_security_main_menu() throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Security')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/p[contains(text(), 'Real-Time Protection')]"));
		menu_navigation(mainMenu, subMenu);
	}

	@Then("user navigates to antivirus page")
	public void user_navigates_to_antivirus_page() throws Exception {
		Boolean avp = driver.getTitle().equals("Antivirus Protection in Real-Time | TotalAV™");
		if(!avp) {
			assertTrue("User did not navigate to anti virus page and current page title is : " + driver.getTitle(), avp);
		} else {
			assertFalse("User is navigated to anti virus page", !avp);
		}
	}
	//VPN menu item
	@When("user selects vpn sublink from security main menu")
	public void user_selects_vpn_sublink_from_security_main_menu() throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Security')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/p[contains(text(), 'Encrypt your connection')]"));
		menu_navigation(mainMenu, subMenu);
	}

	@Then("user navigates to vpn page")
	public void user_navigates_to_vpn_page() throws Exception {
		WebElement h1 = driver.findElement(By.xpath("//*[contains(@class, 'h1')]"));
		Boolean vpn = h1.getText().equals("Encrypt your Browsing, Boost your Privacy Online Today");
		if(!vpn) {
			assertTrue("User did not navigate to vpn page and the current page title is : " + driver.getTitle(), vpn);
		} else {
			assertFalse("User is navigated to vpn page", !vpn);
		}
	}
	//Webshield menu item
	@When("user selects webshield sublink from security main menu")
	public void user_selects_webshield_sublink_from_security_main_menu() throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Security')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/h2[contains(text(), 'WebShield')]"));
		menu_navigation(mainMenu, subMenu);
	}

	@Then("user navigates to webshield page")
	public void user_navigates_to_webshield_page() throws Exception {
		Boolean title = driver.getTitle().equals("Defence Against Phishing Scams | TotalAV™");
		if(!title) {
			assertTrue("User did not navigate to webshield page and the current page title is : " + driver.getTitle(), title);
		} else {
			assertFalse("User is navigated to webshield page", !title);
		}

	}
	//Data breach menu item
	@When("user selects data breach sublink from security main menu")
	public void user_selects_data_breach_sublink_from_security_main_menu() throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Security')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/h2[contains(text(), 'Data Breach')]"));
		menu_navigation(mainMenu, subMenu);
	}

	@Then("user navigates to data breach page")
	public void user_navigates_to_data_breach_page() throws Exception {
		Boolean title = driver.getTitle().equals("Data Breach Monitoring | TotalAV™");
		if(!title) {
			assertTrue("User did not navigate to data breach page and the current page title is : " + driver.getTitle(), title);
		} else {
			assertFalse("User is navigated to data breach page", !title);
		}
	}
	//Total Password menu item
	@When("user selects total password sublink from privacy main menu")
	public void user_selects_total_password_sublink_from_privacy_main_menu() throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Privacy')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/h2[contains(text(), 'Total Password')]"));
		menu_navigation(mainMenu, subMenu);
	}

	@Then("user navigates to total password page")
	public void user_navigates_to_total_password_page() throws Exception {
		Boolean title = driver.getTitle().equals("Keeping Your Passwords Secure | TotalAV™");
		if(!title) {
			assertTrue("User did not navigate to total password page and the current page title is : " + driver.getTitle(), title);
		} else {
			assertFalse("User is navigated to total password page", !title);
		}
	}
	//Identity Protection menu item
	@When("user selects identity protection sublink from privacy main menu")
	public void user_selects_identity_protection_sublink_from_privacy_main_menu() throws InterruptedException {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//div[contains(text(), 'Privacy')]"));
		WebElement subMenu = driver.findElement(By.xpath("//div/h2[contains(text(), 'Identity Protection')]"));
		menu_navigation(mainMenu, subMenu);
	}

	@Then("user navigates to identity protection page")
	public void user_navigates_to_identity_protection_page() throws Exception {
		Boolean title = driver.getTitle().equals("Protecting Your Identity | TotalAV™");
		if(!title) {
			assertTrue("User did not navigate to identity protection page and the current page title is : " + driver.getTitle(), title);
		} else {
			assertFalse("User is navigated to identity protection page", !title);
		}
	}
	//Identity Protection menu item
	@When("user clicks on support link")
	public void user_clicks_on_support_link() {
		WebElement mainMenu = driver.findElement(By.xpath("//ul/li//a[contains(text(), 'Support')]"));
		mainMenu.click();
	}

	@Then("user navigates to support page")
	public void user_navigates_to_support_page() throws Exception {
		Boolean title = driver.getTitle().equals("TotalAV Support Centre – Get Help With Your TotalAV Account");
		if(!title) {
			assertTrue("User did not navigate to support page and the current page title is : " + driver.getTitle(), title);
		} else {
			assertFalse("User is navigated to support page", !title);
		}
	}
}

