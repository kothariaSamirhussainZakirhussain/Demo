package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://ttstage.addwebprojects.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("saurabhdhariwal.com@gmail.com");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("addweb123");

		WebElement checkbox = driver.findElement(By.id("checkbox-signup"));

		if (!checkbox.isSelected()) {
			checkbox.click();
		}

		driver.findElement(By.id("submit-login")).click();
		WebElement dropdown = driver.findElement(By.id("type"));
		

	}
}
