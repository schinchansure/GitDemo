package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set <String> Windows = driver.getWindowHandles();
		Iterator<String>it =  Windows.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(ParentID);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	}

}
