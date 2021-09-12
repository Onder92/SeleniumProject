import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='BKK'])[2]")).click();
	}

}
