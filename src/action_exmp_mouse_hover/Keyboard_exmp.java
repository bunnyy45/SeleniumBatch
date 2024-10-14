package action_exmp_mouse_hover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_exmp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		Thread.sleep(3000);
		
		WebElement copy=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		copy.sendKeys("already we are writing");
		// inspect text field area & enter text using sendkey method
		Thread.sleep(3000);
	
		WebElement paster=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		
		Actions act=new Actions(driver);
		
		//selecting the entire text CTRL A
		act.moveToElement(copy);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		
		//copying the text CNTRL A
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		//TAB .. shift to second tab
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//pasting cntrl V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		driver.close();

	}

}
