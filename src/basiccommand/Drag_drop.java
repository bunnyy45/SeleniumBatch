package basiccommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);    //index value of frame
		Thread.sleep(3000);
		
		WebElement source=driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		
		WebElement target=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);
		driver.close();		
		
	}

}
