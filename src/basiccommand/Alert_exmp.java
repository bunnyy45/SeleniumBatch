package basiccommand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_exmp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(3000);
		driver.findElement(null);  // to click on sign in button
		Thread.sleep(3000);
		Alert a1=driver.switchTo().alert();
		a1.accept();            // to click on ok when alert come on webpage

	}

}
