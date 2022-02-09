package com.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class NuevaTest {
	
	public static WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
	  }
	  
	  @Test
	  public void googleTest() throws InterruptedException {
		  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hewlett Packard\\git\\repository\\SeleniumCursoEnero\\src\\test\\resources\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			Assert.assertEquals(driver.getTitle(), "Google");
			
			Thread.sleep(5000);

	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}