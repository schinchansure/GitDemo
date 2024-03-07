package Fight;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\supri\\OneDrive\\Documents\\Automation\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	    driver.get("https://rahulshettyacademy.com/locatorspractice/");

	    driver.findElement(By.id("inputUsername")).sendKeys("rahul");

	    driver.findElement(By.name("inputPassword")).sendKeys("hello123");

	    driver.findElement(By.className("signInBtn")).click();
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();	
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jack");
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jack@gmail.com");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jack1@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("8888888888");
	    Thread.sleep(2000);
	    driver.findElement(By.className("reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Harry");
	    driver.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy");
	    Thread.sleep(2000);
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	
	
	
	
	
	
	}

}
