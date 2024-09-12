package basiccommand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_exm {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");  //demoqa.com/alert website link
		Thread.sleep(3000);
		driver.findElement(by);     // inspect for confirmbutton and perform action click
		Thread.sleep(3000);
		Alert alr=driver.switchTo().alert();
		alr.dismiss();    // to click on cancel button when alert come
		*/
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(3000);
		driver.findElement(by.);
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		Actions act=new Actions(driver);
		act.sendKeys(args);
		

	}

}
