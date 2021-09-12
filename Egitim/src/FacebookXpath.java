import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hoop");
		
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("12344");
		
		driver.findElement(By.xpath("\"//button[@id='u_0_h_MP']")).click();
	}

}
