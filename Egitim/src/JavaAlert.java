import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String text="Önder";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[value='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		   
	}

}
