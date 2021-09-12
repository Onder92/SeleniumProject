import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		
		
		//Count the checkboxes
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

	
}