package Miscellenous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 List<WebElement>links = driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));
		
 	SoftAssert a = new SoftAssert();
 for (WebElement link : links) {
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();		
			System.out.println(respcode);
			a.assertTrue(respcode<400, "The link with Text"+link.getText()+" is broken code"+respcode);
			
//			if(respc ode>400) {
//				System.out.println("The link with Text"+link.getText()+" is broken code"+resp code);
//				
//				Assert.assertTrue(false);
//			}
		
		}
		a.assertAll();		
		
		
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respcode = conn.getResponseCode();		
		System.out.println(respcode);
		
		
		
		
	}

}
