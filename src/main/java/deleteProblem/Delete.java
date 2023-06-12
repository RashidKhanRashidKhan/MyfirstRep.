package deleteProblem;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete {
	
public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.vuse.com/gb/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(14));

		
			WebElement acceptcookiesElement=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
			acceptcookiesElement.click();
		  
	
			
			WebElement Iam18=driver.findElement(By.xpath("//div[@class='dialog-buttonWrap-3xa']/button[2]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", Iam18);
			
			
					
			WebElement searchProductElement=driver.findElement(By.xpath("//input[@placeholder='Search for flavours and devices...']"));
			searchProductElement.sendKeys("eLiquide Bottles");
			
			Actions a=new Actions(driver);
			a.sendKeys(Keys.ENTER).build().perform();
		    
		
		
			WebElement goToPdpElement=driver.findElement(By.xpath("(//a[@class='productCompactDetail-imageLink-2BC'])[6]"));
			goToPdpElement.click();

		   
		
			WebElement addToCardProductElement=driver.findElement(By.xpath("//section[@class='productFullDetail-cartActions-11b productFullDetail-section-gqQ']/button[1]/span[1]"));
			addToCardProductElement.click();
		    
		
			WebElement goToBasketPagElement=driver.findElement(By.xpath("(//span[@class='icon-root-XQD'])[6]"));
			goToBasketPagElement.click();
			//Alert d=driver.switchTo().alert();
			
		    WebElement deletProductElement=driver.findElement(By.xpath("//button[@class='item-deleteButton-3Eu']"));
		    //deletProductElement.click();
		    JavascriptExecutor er = (JavascriptExecutor)driver;
			er.executeScript("arguments[0].click();", deletProductElement);
		    
		WebElement verifyCardIsEmty=driver.findElement(By.xpath("(//button[@aria-label='Toggle mini cart. You have 0 items in your cart.'])[1]"));
		assertTrue(verifyCardIsEmty.isDisplayed());
		driver.quit();
	}

public static void assertTrue(boolean displayed) {
	// TODO Auto-generated method stub
	
}
	
	

}
