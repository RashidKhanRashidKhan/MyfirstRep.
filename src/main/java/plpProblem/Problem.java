package plpProblem;

import java.time.Duration;
import java.util.List;

import javax.accessibility.AccessibleStateSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Problem {

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

		//public void accept_cookies_pop_up() {
			WebElement acceptcookiesElement=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
			acceptcookiesElement.click();
		   //}
		

		
	//	public void accept_i_am_pop_up(Integer int1) {
			
			WebElement Iam18=driver.findElement(By.xpath("//div[@class='dialog-buttonWrap-3xa']/button[2]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", Iam18);
			//}
			
			
		  
		

		
		//public void go_to_home_page_and_search_product() {
			WebElement searchProductElement=driver.findElement(By.xpath("//input[@placeholder='Search for flavours and devices...']"));
			searchProductElement.sendKeys("Vuse go device");
			
			Actions a=new Actions(driver);
			a.sendKeys(Keys.ENTER).build().perform();
			//}
			
		  
		

		//Vuse ePod and Vuse GO Blueberry Ice Bundle
		//public void go_to_plp_and_product_add_to_basket() {
			WebElement addToCardProductElement=driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/article/section[1]/div/div/div[19]/form/section[2]/button/span"));
			addToCardProductElement.click();
			//}
			
			
		  
	


		//public void check_product_add_or_not_in_basket() {
	
        WebElement verifyProductAddOrNot=driver.findElement(By.xpath("//*[@id=\"header-navBar\"]/div/div[2]/div[4]/button/span[2]"));

		assertTrue(verifyProductAddOrNot.isDisplayed());
		driver.quit();
		

	
	
				}

	private static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}
			
	}

