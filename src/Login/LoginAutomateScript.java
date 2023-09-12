package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginAutomateScript {
	
	static {
		// Set up the WebDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//To aviod IOExecption
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--remote-allow-origins=*");
		//Opening the Chrome Browser
		WebDriver driver=new ChromeDriver(ch);
		//Maximize the window
		driver.manage().window().maximize();
		//Wait for the element or page to display
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // Navigate to the login page
		driver.get("https://demo.actitime.com/login.do");
		//Enter the Username
		driver.findElement(By.id("username")).sendKeys("admin");
		//Enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//clicking on Login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//Wait for Home page
		Thread.sleep(5000);
		//Close the window
		driver.close();
	}

}
