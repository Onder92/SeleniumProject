import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//int i=1;
		//while(i<5);    
        for (int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			//i++;
		}
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
