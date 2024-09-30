package Practice;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	 public static void main(String[] args, Object FileUtils) throws IOException {
		 System.setProperty("webdriver.chrome.driver","D:/Gaurav/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://itechforest.com");
	        
	       //Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            org.apache.commons.io.FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        //closing the webdriver
	        driver.close();
	 }
}
