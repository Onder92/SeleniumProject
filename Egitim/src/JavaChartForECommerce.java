import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaChartForECommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
        
        for (int i=0;i<products.size();i++);
  

}
}
