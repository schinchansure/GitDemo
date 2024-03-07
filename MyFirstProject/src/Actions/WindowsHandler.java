package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandler {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();

		Set <String> Windows = driver.getWindowHandles();  //[Parentid, Childid]
		Iterator<String>it = Windows.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		String EmailID = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(ParentID);
		driver.findElement(By.id("username")).sendKeys(EmailID);
		

	}

}
