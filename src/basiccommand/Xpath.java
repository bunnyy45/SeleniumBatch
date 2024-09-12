package basiccommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*  x-path method
		 
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		 
		 
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yahyashaikh@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		driver.close();
		
		*/
		
		
		/* x-path starts with method
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();	
        */
		
		
		/* x path contains with
		 
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("yahya@gmail.com");
		
		*/
		
		
		/* xpath using contains method with text() function
		 
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		*/
		
		/* xpath using and
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("ash@gmail");
		
		*/
		
		/* xpath using or 
		 
		 driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("ash@gmail");
		
		 */
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click(); 
		Thread.sleep(3000);
		

		

	}

}
