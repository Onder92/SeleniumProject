import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown2 {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();    

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    driver.manage().window().maximize();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    System.out.println(driver.getTitle());

// OriginStation

    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

    driver.findElement(By.cssSelector("a[value='DEL']")).click();

        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));

        // Destination

        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     

        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();   

        System.out.println( driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));

}

}
