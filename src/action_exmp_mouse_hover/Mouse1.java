package action_exmp_mouse_hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/blog/perform-mouse-actions-in-selenium-webdriver/");
		
		WebElement platform=driver.findElement(By.xpath("//div[@class='dropdown rs-dropdown dropdown_blog item_link']"));
		Actions act=new Actions(driver);
		act.moveToElement(platform);
		act.clickAndHold(platform);
		Thread.sleep(3000);
		driver.close();
		
	}

}
