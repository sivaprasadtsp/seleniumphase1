package seleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinitextPartialDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(1500); // wait for 1.5 seconds
		
		
		
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		
		
		
		driver.findElement(By.id("wpPassword1")).sendKeys("admin@123");
		
		
		driver.findElement(By.id("wpRemember")).click();
		
		Thread.sleep(1500);
		
		
		
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.partialLinkText("account")).click();

	}

}
