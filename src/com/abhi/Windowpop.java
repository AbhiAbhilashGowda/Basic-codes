package com.abhi;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowpop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		WebElement ITjobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(ITjobs).perform();
		driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Java Developer']")).click();
		Thread.sleep(2000);
		String mainId = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for (String id : allid) {
			if (!(mainId.equals(id))) {
				driver.switchTo().window(id);
				String title = driver.findElement(By.xpath("//h2[text()='Jobs you might be interested in']")).getText();
				System.out.println(title);
				driver.close();
				driver.switchTo().window(mainId);
				System.out.println(driver.getTitle());

			}
		}

	}

}
