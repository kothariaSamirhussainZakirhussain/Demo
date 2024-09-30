package Practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
   public static void main(String[] args) {
	   
	System.setProperty("webdriver.chrome.driver","D:/Gaurav/chromedriver-win64/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	Dimension d = new Dimension(500, 500);
	driver.manage().window().setSize(d);
	driver.navigate().to("https://www.facebook.com/");

}
}
