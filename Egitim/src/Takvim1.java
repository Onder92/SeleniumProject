import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takvim1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        
        
	}

}
