package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(1000);

		WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
		Thread.sleep(1000);

		WebElement Click_btn=driver.findElement(By.linkText("Log in"));
		
		Username.sendKeys("yahya");
		Password.sendKeys("12345678");
		Click_btn.click();
		
		driver.close();
		
		
	}

}
