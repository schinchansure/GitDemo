package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice//");
		driver.findElement(By.id("checkBoxOption2")).click();
		String Text = (driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());
		WebElement Opt = driver.findElement(By.id("dropdown-class-example"));
		
		Select S = new Select (Opt);
		S.selectByVisibleText(Text);
		driver.findElement(By.id("name")).sendKeys(Text);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		if (text.contains(Text)) {
			
			System.out.println("Alert Message Success");
		}
		else
		{
			System.out.println("Alert Message Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static Select Select(WebElement opt) {
		// TODO Auto-generated method stub
		return null;
	}

}
