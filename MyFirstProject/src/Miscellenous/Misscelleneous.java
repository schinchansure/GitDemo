package Miscellenous;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Misscelleneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize
		driver.manage().deleteAllCookies();  //delete all coockies
		driver.manage().deleteCookieNamed("sddf"); //perticular cookie
	
		driver.get("http://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\supri\\screenshot.png"));
		
		
		
		
		
		
		
		
		
		
	}

}
