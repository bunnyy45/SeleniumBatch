package basiccommand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_exm {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		Alert alr=driver.switchTo().alert();
		alr.accept();    // to click on cancel button when alert come
		Thread.sleep(3000);
		driver.close();
		*/
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		Alert promptalert=driver.switchTo().alert();
		
		promptalert.sendKeys("send keys hi");
		Thread.sleep(3000);
		promptalert.accept();
		driver.close();
		

	

	}

}





