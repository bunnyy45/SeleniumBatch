package conditional_exmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplay_method {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath(""));
		System.out.println( logo.isDisplayed());
		
	}

}
