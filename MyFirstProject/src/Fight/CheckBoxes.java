package Fight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				    WebDriver driver = new ChromeDriver();
				    driver.manage().window().maximize();
				    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				    
				   driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				 
				   Assert.assertFalse(driver.findElement(By.id("StudentDiv")).isSelected());
				    driver.findElement(By.id("StudentDiv")).click();
				    Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
				    
				    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		
		
		
	}

}
