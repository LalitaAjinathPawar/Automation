package Cookies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class deletecookie {
	
	@Test
	public void deletecookie1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php/");
		driver.findElement(By.name("username")).sendKeys("lalitaapawar077@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.name("submit")).click();
		
		//get cookies//
		Set<Cookie> cookielist=driver.manage().getCookies();
		System.out.println(cookielist);
		//delete cookies//
		driver.manage().deleteAllCookies();
		System.out.println("deleted cookies sucessfully");
		Set<Cookie> cookielist1=driver.manage().getCookies();
		System.out.println(cookielist1);
	
	
	}

}
