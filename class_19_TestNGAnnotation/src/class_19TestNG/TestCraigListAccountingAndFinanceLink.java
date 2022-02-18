package class_19TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCraigListAccountingAndFinanceLink {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver site;
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		site = new ChromeDriver();
		site.get("https://oklahomacity.craigslist.org/");
		site.manage().window().maximize();
		site.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		site.findElement(By.xpath("//span[text()='accounting+finance']")).click();
		String result= site.findElement(By.linkText("accounting/finance")).getText();
		
		Assert.assertEquals(result, "accounting/finance");
		
		
	}
}
