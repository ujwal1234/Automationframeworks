package base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverManager;


public class BasePage {
	
	
	
	public static WebDriver driver;
	public static CarBase car;
	
	
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver; //DriverManager.getDriver();
		car = new CarBase(driver);
		PageFactory.initElements(driver, this);
		System.out.println("This is the constructor of my Base page class");
		System.out.println("This is the constructor of my Base page class");
		System.out.println("This is the constructor of my Base page class");
		
	}
	
	

	
	
	

	public void click(WebElement element) {
		
		element.click();
		
		//extent log
	}
	

}
