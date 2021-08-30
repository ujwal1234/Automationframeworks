package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class HomePage extends BasePage{
	
	public WebDriverWait wait;

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//@FindBy(xpath="//*[@id=\"cw-top-navbar\"]/li[1]/div[1]/span[1]")
	@FindBy(xpath="//div[normalize-space()='NEW CARS']")
	public WebElement newCars;
	
	//@FindBy(xpath="//*[@id=\"cw-top-navbar\"]/li[1]/div[2]/div/div[1]/div[1]/ul/li[1]/a")
	@FindBy(xpath="div[contains(text(),'Find New Cars')]")
	////div[contains(text(),'Find New Cars')]
	public WebElement findNewCars;
	
	
	public NewCarsPage findNewCar() throws InterruptedException {
		
		new Actions(driver).moveToElement(newCars).perform();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("div[contains(text(),'Find New Cars')]")));
		findNewCars.click();
		return new NewCarsPage(driver);
	}
	

}
