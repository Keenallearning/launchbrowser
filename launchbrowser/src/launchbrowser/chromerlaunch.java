
package launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromerlaunch {
	
	public static void main(String args[]) throws InterruptedException
	{
	
	WebDriver driver = new ChromeDriver();
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
	
	driver.get("wwww.google.com");

	
	driver.close();
	
	}
	

}
