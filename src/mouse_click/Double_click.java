package mouse_click;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);      
		Thread.sleep(3000);
		
		WebElement doubleclckbtn=driver.findElement(null); // inspent double click button and getn locator
		WebElement rightclckbtn=driver.findElement(null);  //inspect right click button
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		 act.doubleClick(doubleclckbtn).perform();  // double click method used
		 act.contextClick(rightclckbtn).perform();  // right click
		 
		 Thread.sleep(3000);
	}

}
