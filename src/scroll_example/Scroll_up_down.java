package scroll_example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		// for scroll down we have to use js bcz selenium do not provide for scroll
		
		JavascriptExecutor js=( JavascriptExecutor )driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		
		//for scroll dwn
		js.executeAsyncScript("window.scrollBy(0,-400)");
		Thread.sleep(3000);
		
		
	}

}
