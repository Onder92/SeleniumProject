import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3Yok {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\90538\\Desktop\\Yazýlým Testi Eðitim\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select para = new Select(dropdown);
		para.selectByVisibleText("USD");
		Thread.sleep(2000);
		para.selectByValue("AED");
		Thread.sleep(2000);
		para.selectByIndex(0);
	}

}
