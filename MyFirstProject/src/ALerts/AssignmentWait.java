package ALerts;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWait {

	private static int i;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label/input[@value='user']")).click();
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//select/option[3]")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List <WebElement> Products =  driver.findElements(By.className("btn-info"));
		
		for(int i =0;i<Products.size();i++)

		{

		Products.get(i).click();

		}
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Checkout")).click();		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
