package Fight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.className("ui-datepicker-trigger")).isEnabled());
	    Thread.sleep(2000);
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.className("ui-datepicker-trigger")).isEnabled());
	    
	    
	}
}