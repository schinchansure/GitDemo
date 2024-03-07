package Fight;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\supri\\OneDrive\\Documents\\Automation\\chromedriver-win64\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//	    driver.get("https://rahulshettyacademy.com/");
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.close();
	
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\supri\\OneDrive\\Documents\\Automation\\geckodriver.exe");

//	FirefoxDriver driver = new FirefoxDriver();
//    driver.get("https://rahulshettyacademy.com/");
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
//driver.close();
//	
		//System.setProperty("webdriver.msedgedriver.driver", "C:\\Users\\supri\\OneDrive\\Documents\\Automation\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
driver.get("https://rahulshettyacademy.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
	}
	
	

}
