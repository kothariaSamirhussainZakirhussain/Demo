package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Itech {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:/Gaurav/chromedriver-win64/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Home page
		driver.get("https://itechforest.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,-500)");
		
		WebElement Portfolio = driver.findElement(By.partialLinkText("Portfolio"));
		Portfolio.click();	
		
		driver.findElement(By.className("wm-slidebg")).click();
		js.executeScript("window.scrollBy(0,400)");
		js.executeScript("window.scrollBy(0,-400)");
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		
        // About us page
		WebElement About= driver.findElement(By.partialLinkText("About Us"));
		About.click();

		// Career page
		WebElement Career = driver.findElement(By.partialLinkText("Career"));
		Career.click();
		
		driver.findElement(By.id("Name")).sendKeys("Gaurav");
	    driver.findElement(By.id("Email")).sendKeys("gauravzalavadiya123@gmail.com");
	    driver.findElement(By.id("MobileNo")).sendKeys("8849485558");
	    driver.findElement(By.id("Experience")).sendKeys("Fresher");
	    WebElement Up = driver.findElement(By.id("ResumeFile"));
	    Up.sendKeys("D:/Gaurav/Sample-TestCases_HotelApplication.pdf");
	    WebElement a = driver.findElement(By.xpath("//*[@id=\"ApplyFor\"]"));
	    a.click();
	    Select s=new Select(a);
	    s.selectByValue("Microsoft Fullstack Web Developer [0 - 3 yr Exp.] - 2 Position");
	    WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("btnCareer"))));
	    driver.findElement(By.id("btnCareer")).click();
	    
	    driver.navigate().back();
        	    
        // Contact Us page
	    WebElement Contact= driver.findElement(By.partialLinkText("Contact Us"));
		Contact.click();
		driver.findElement(By.id("FirstName")).sendKeys("Gaurav");
	    driver.findElement(By.id("LastName")).sendKeys("Zalvadiya");
	    driver.findElement(By.id("Subject")).sendKeys("For Testing Purpose");
	    driver.findElement(By.id("Email")).sendKeys("gauravzalavadiya123@gmail.com");
	    driver.findElement(By.id("Message")).sendKeys("This is a practice concept nothing..");
	    driver.findElement(By.id("btnSave")).click();
        
        driver.navigate().to("https://itechforest.com/");
       
        // Services Page
    	WebElement Service= driver.findElement(By.partialLinkText("Services"));
    	Service.click();
  	    js.executeScript("window.scrollBy(0,400)");
		js.executeScript("window.scrollBy(0,-400)");
		
  	    driver.navigate().back();
  	    
 		// Hosting Page
		WebElement Hosting= driver.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/div/div/div/div[2]/nav/ul/li[5]/a"));
		Actions a1 = new Actions(driver);
	    a1.moveToElement(Hosting).perform();
	    WebElement vps = driver.findElement(By.partialLinkText("VPS"));
	    a1.moveToElement(vps).click().perform();
		
        driver.quit();
	    
        
	}
}








// Up.sendKeys(Keys.RETURN);
//String childWindow = driver.getWindowHandle();
//driver.switchTo().window(childWindow);
