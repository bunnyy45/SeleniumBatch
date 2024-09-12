package action_exmp_mouse_hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		WebElement computer=driver.findElement(By.linkText("COMPUTERS"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(computer).build().perform();
		Thread.sleep(3000);
		driver.close();

	}

}
