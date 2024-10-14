package basiccommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_selenium {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);   // 3s 1s=1000 mili sec
		driver.findElement(By.cssSelector(".oxd-input-group__label-wrapper")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.close();
		}

	}
