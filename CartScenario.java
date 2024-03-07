package ALerts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] items = {"cucumber", "Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	}
}