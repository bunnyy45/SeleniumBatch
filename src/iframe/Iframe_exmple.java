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
		driver.switchTo().frame(frame); //frame(0) is a index value of frame
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hi all");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("every");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();

		driver.close();
		
	}
	
}
