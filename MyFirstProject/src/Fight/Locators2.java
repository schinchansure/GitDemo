package Fight;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		String name = "Jay";
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supri\\OneDrive\\Documents\\Automation\\chromedriver.exe");
	   // WebDriver driver = new ChromeDriver();
	   // WebDriver driver = new FirefoxDriver();
	    WebDriver driver = new EdgeDriver();
	    String password = getpassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();	
		}	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();	
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(2000);
	    String PasswordText = driver.findElement(By.cssSelector("form p")).getText();
	    String[] PasswordArray =  PasswordText.split("'");
	    String[] PasswordArray2 = PasswordArray[1].split("'");
	    String Password = PasswordArray[1].split("'")[0];
	    return Password;
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
