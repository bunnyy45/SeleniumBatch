package action_exmp_mouse_hover;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_exmp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);
		
		Thread.sleep(3000);
		
		driver.findElement(null).sendKeys(""); ;  // inspect text field area & enter text using sendkey method
	
		
		Actions act=new Actions(driver);
		
		//selecting the entire text CTRL A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//copying the text CNTRL A
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB .. shift to second tab
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//pasting cntrl V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
