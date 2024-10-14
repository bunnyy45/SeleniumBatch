package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listexm2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		List <WebElement> link_count=driver.findElements(By.tagName("a"));
		
		for (int i=0;i<=link_count.size();i++) {
			
			String linkname=link_count.get(i).getText();
			
			if(linkname.startsWith("M")) {
				System.out.println(linkname);
			}
		}	
	}
}
