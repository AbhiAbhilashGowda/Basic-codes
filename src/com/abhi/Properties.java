package com.abhi;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {

	public static void main(String[] args)  throws IOException{
      FileInputStream fis=new FileInputStream fis("C:\\Users\\abhi\\OneDrive\\Desktop\\html\\data.properties");
      Properties pobj=new Properties();
      pobj.load(fis);
      String URL=pobj.getproperty("URL");
      System.out.println(URL);
      String username=pobj.getproperty("usernamr");
      System.out.println(username);
      String password=pobj.getproperty("password");
      System.out.println(password);
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
      
      
      
	}

}
