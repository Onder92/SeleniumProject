import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ÝlkLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		
		WebDriver Locator1=new ChromeDriver();
		
		Locator1.get("http://login.salesforce.com/?locale=eu");
		
		/*Locator1.findElement(By.id("email")).sendKeys("This is the first code");
		
		Locator1.findElement(By.name("pass")).sendKeys("123456");
		
		Locator1.findElement(By.linkText("Þifreni mi Unuttun?")).click();*/
		
		Locator1.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Skerun");
		
		Locator1.findElement(By.cssSelector("#password")).sendKeys("123456");
		
		Locator1.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(Locator1.findElement(By.cssSelector("#error")).getText());
		
		Locator1.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
		
		
	}

}
