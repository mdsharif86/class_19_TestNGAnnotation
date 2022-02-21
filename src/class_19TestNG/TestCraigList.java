package class_19TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCraigList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver site;
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		site = new ChromeDriver();
		site.get("https://oklahomacity.craigslist.org/");
		site.manage().window().maximize();
		site.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		site.findElement(By.xpath("//span[text()='apts / housing']")).click();
		boolean result= site.findElement(By.linkText("apartments / housing for rent")).isDisplayed();
		if(result==true) {
			System.out.println("apts / housing link is working fine");
		}
		if(result==false) {
			System.out.println("apts/ housing link is not working fine");
		}
		
		

	}

}
