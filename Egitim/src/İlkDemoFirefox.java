import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class �lkDemoFirefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\90538\\Desktop\\Yaz�l�m Testi E�itim\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http:\\google.com");
		System.out.println(driver.getTitle());
		
	}
}
