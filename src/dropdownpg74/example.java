package dropdownpg74;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement choose=driver.findElement(By.tagName("select"));
		
		Select obj=new Select(choose);
//		obj.selectByValue("DZA");     //
		obj.selectByVisibleText("Andorra");
		driver.close();
		
		
		

	}

}
