package imUnder18;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.Alert;

//import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImUnder18 {
	WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.vuse.com/gb/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(16));

		
			WebElement acceptcookiesElement=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
			acceptcookiesElement.click();
		  
	
			
			WebElement ImUnder18=driver.findElement(By.xpath("//div[@class='dialog-buttonWrap-3xa']/button[1]"));
			//ImUnder18.click();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ImUnder18);
			
			WebElement waitForGooglElement=driver.findElement(By.xpath("//img[@alt='Google']"));
			assertTrue(waitForGooglElement.isDisplayed());
			driver.quit();
			
			}

	public static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}
		}
		
		
	

	


