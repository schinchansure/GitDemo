package Fight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    driver.findElement(By.className("form-control")).sendKeys("Supriya");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.xpath("//select/option[2]")).click();
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("09/17/1992");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.className("alert")).getText());
		
	}

}
