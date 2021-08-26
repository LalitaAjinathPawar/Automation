package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addcookies {
	
	@Test
	public void addcookies()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Cookie name=new Cookie("Addcookies","412356");
		
		driver.manage().addCookie(name);
		
		Set<Cookie> Cookie_List=driver.manage().getCookies();
		for(Cookie getcookie:Cookie_List)
		{
			System.out.println(getcookie);
		}	
		}
}
