package regiProblem;

//import static org.junit.Assert.assertTrue;



import java.text.BreakIterator;

//import java.security.PublicKey;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProblemR {
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--incognito");
	option.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.vuse.com/gb/en/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(14));

	WebElement acceptcokies=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
	acceptcokies.click();
	Thread.sleep(6000);

	WebElement Iam18=driver.findElement(By.xpath("//div[@class='dialog-buttonWrap-3xa']/button[2]"));
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", Iam18);
			
	WebElement clicktosign=driver.findElement(By.xpath("//span[@class='accountChip-root-2kC']"));
	clicktosign.click();

		
			WebElement clicktonewuser=driver.findElement(By.xpath("//li[@class='signInSocial-tab-1vZ']"));
			clicktonewuser.click();
			    
		
			WebElement clicktosignup=driver.findElement(By.xpath("(//span[@class='button-content-3ns'])[1]"));
			clicktosignup.click();
			    
		
			WebElement firstname=driver.findElement(By.xpath("//input[@name='customer.firstname']"));
			firstname.sendKeys("Rashid");
			 
			WebElement lastname=driver.findElement(By.xpath("//input[@name='customer.lastname']"));
			lastname.sendKeys("Khan");
			
			WebElement email=driver.findElement(By.xpath("//input[@autocomplete='email']"));
			email.sendKeys("Rashid123@gmail.com");
			
			
			WebElement dob=driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']"));
			dob.sendKeys("17/06/1999");
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(14));
			wait.until(ExpectedConditions.visibilityOf(dob));
			
			
			WebElement manualyadd=driver.findElement(By.xpath("//div[@class='addressLookupToggle-root-3OY']/span[1]"));
			manualyadd.click();
			
			WebElement streetadd=driver.findElement(By.xpath("//input[@name='street[0]']"));
			streetadd.sendKeys("India, 58-59 North Street, SUDBURY, CO10 1RE, UNITED KINGDOM");
			
			WebElement Dob=driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']"));
			Dob.sendKeys("17/06/1998");
			
			WebElement cityadd=driver.findElement(By.xpath("//input[@name='city']"));
			cityadd.sendKeys("London");
			
			WebElement countyadd=driver.findElement(By.xpath("//input[@name='region[region]']"));
			countyadd.sendKeys("UK");
			
			WebElement postcod=driver.findElement(By.xpath("//input[@name='postcode']"));
			postcod.sendKeys("co10");
			
			
			WebElement phnumber=driver.findElement(By.xpath("//input[@name='telephone']"));
			
			
			phnumber.sendKeys("+447911123556");
			
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Rashi@123");
			
			WebElement cunfirmpass=driver.findElement(By.xpath("//input[@name='password_confirm']"));
			cunfirmpass.sendKeys("Rashi@123");
			
			WebElement TandC=driver.findElement(By.xpath("(//span[@class='checkbox-switchToggle-3tC right'])[1]"));
			TandC.click();
	  
			WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			
		
			WebElement errrormasage=driver.findElement(By.xpath("//span[@class='errorMessage-errorMessage-3sE']"));
			assertTrue(errrormasage.isDisplayed()); 
				driver.quit();
	}
	

	public static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}

	
	}

	
	
	
	


	
		



