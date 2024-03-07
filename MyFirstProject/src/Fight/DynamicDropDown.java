package Fight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='BLR']")).click();
	    System.out.println(driver.findElement(By.xpath("//a[@value='BLR']")).getText());
	    //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='MAA']")).click();
	    System.out.println(driver.findElement(By.xpath("//a[@value='MAA']")).getText());
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

	    {

	    System.out.println("its disabled");

	    Assert.assertTrue(true);

	    }

	    else

	    {

	    Assert.assertTrue(false);

	    }

	    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

	    driver.findElement(By.id("divpaxinfo")).click();

	       Thread.sleep(2000L);

	    for(int i=1;i<5;i++)

	    {

	    driver.findElement(By.id("hrefIncAdt")).click();

	    }

	    driver.findElement(By.id("btnclosepaxoption")).click();
	    driver.findElement(By.id("StudentDiv")).click();
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	    
	    
	}

}
