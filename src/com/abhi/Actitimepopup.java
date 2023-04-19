package com.abhi;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimepopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("abhinew");
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		System.out.print(msg);
		alt.dismiss();
		WebElement screen = driver.findElement(By.xpath("//td[@class='mainContentPadding rightPadding']//td"));
		File src = screen.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/actiscreen tests.png");
		FileUtils.copyFile(src, trg);

	}

}
//