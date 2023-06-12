package pdpProblem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Problem {
	
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
			searchProductElement.sendKeys("eLiquid Bottles");
			
			Actions a=new Actions(driver);
			a.sendKeys(Keys.ENTER).build().perform();
			
			//Vuse eLiquid Bottle Original Strawberry
		
			WebElement goToPdpElement=driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/article/section[1]/div/div/div[8]/form/a/div/img[2]"));
			//goToPdpElement.click();
			JavascriptExecutor exe = (JavascriptExecutor)driver;
			exe.executeScript("arguments[0].click();", goToPdpElement);
			
			WebElement addToCardProductElement=driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/form/div[2]/section[2]/button/span"));
			addToCardProductElement.click();
			
	WebElement Validetion=driver.findElement(By.xpath("//*[@id=\"header-navBar\"]/div/div[2]/div[4]/button/span[3]"));
			assertTrue(Validetion.isDisplayed());
			driver.quit();
			
		
	}

	private static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}

}
