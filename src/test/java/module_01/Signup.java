package module_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.findElement(By.name("origin")).sendKeys("Hyderabad");
		driver.findElement(By.name("destination")).sendKeys("Chennai");
		WebElement cls=driver.findElement(By.id("react-select-3-input"));
		Select Clss=new Select(cls);
		Clss.selectByIndex(1);
		driver.findElement(By.className("btn btn-success")).submit();
		
		
		
		
	}

}
