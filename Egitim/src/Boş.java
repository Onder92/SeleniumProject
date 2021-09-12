import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boþ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/eu/?ir=1");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']")).click();
		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("Lololo");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123214");
		driver.findElement(By.cssSelector("input[id*='Login']")).click();
		
		
		driver.close();
		
	}

}
