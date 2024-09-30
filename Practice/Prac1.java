package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Prac1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:/Gaurav/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com");
				driver.findElement(By.className("gLFyf")).sendKeys("ChatGPT");
				driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

		        try {
		            Thread.sleep(5000); 
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        
		        List<WebElement> searchResults = driver.findElements(By.cssSelector("div.g"));

		        for (WebElement result : searchResults) {
		         WebElement linkElement = result.findElement(By.cssSelector("a"));
 
		            String url = linkElement.getAttribute("href");
		            String title = linkElement.getText();

		            System.out.println("URL: " + url);
		            System.out.println("Title: " + title);
		            if (title.contains("ChatGPT")) {
		                linkElement.click();
		                break; 
		            }
		        }

		        try {
		            Thread.sleep(5000); // 5 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        
		        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div[1]/div/div/div/div/a[1]")).click();	
		        // CHAT GPT DOESN'T SUPPORT AUTOMATION
		        
		        driver.quit();
		    }
		

	}

