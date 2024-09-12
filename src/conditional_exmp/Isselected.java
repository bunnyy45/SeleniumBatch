package conditional_exmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		
		WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(female.isSelected());

	}

}
