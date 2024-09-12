package basiccommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creating_acc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click(); 
	//	driver.findElement(By.partialLinkText("Create new")).click();
		
		// by using css selector using css with attribute(name)
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Yahya");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Shaikh");
	    driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("yahyashaikh945@gmail.com");
	    
	    // by using css selector using css with id(#)
	    
	    driver.findElement(By.cssSelector("#password_step_input")).sendKeys("12345678");
	    driver.findElement(By.cssSelector("#day")).sendKeys("3");
	   

		
		
		

	}

}
