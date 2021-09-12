 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();      
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
        	System.out.println("Return date is disabled");
        	Assert.assertTrue(true);
        }
        
        else
        {
        	Assert.assertTrue(false);
        }
        
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	    driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
	    	    //countCheckboxes
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	    
        
        
        
        
        }
        
	
}

