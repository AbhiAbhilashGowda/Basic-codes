package com.abhi;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaDynamic {
	ChromeDriver driver;

	public static void main(String[] args) {

		CoronaDynamic coronaDynamic = new CoronaDynamic();

		coronaDynamic.login();
		coronaDynamic.openbrowser();
		
		List<String> li=coronaDynamic.Corona_Details();
		System.out.println("Corona causes : "+ li.get(0)); 
		System.out.println("Corona death no's : "+li.get(1));
		System.out.println("Corona recover patient : "+li.get(2));
	 
	    

		coronaDynamic.close();
	}

	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\OneDrive\\Desktop\\selenium all jar file\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void openbrowser() {
		driver.get("https://www.worldometers.info/coronavirus/");
	}

	public List<String> Corona_Details() {
		List<String> list=new ArrayList<>();
		String corona_causes = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div")).getText();
		String deaths = driver.findElement(By.xpath("//h1[text()='Deaths:']/../div")).getText();
		String recover = driver.findElement(By.xpath("//h1[text()='Recovered:']/../div")).getText();
		
		list.add(corona_causes);
		list.add(deaths);
		list.add(recover);
		return list;
	}


	public void close() {
		driver.close();
	}

}

