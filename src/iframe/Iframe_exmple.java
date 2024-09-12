package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_exmple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		
		//frame 1
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hi all");
		
		
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("welcome to frame 3");

		
		
	}

}
