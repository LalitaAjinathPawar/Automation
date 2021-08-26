package Cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getcookies {
	@Test
	public void test() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ksrtc.in/oprs-web/login/show.do");
	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys("username");
	driver.findElement(By.id("password")).sendKeys("password");
	driver.findElement(By.id("submitBtn")).click();
	File file1=new File("C:\\Users\\lalitaajinath.pawar\\OneDrive - HCL Technologies Ltd\\Cookie\\cookies.data");
	
	try
	{
	file1.createNewFile();
	FileWriter fw=new FileWriter(file1);
	BufferedWriter bw=new BufferedWriter(fw);
	
	for(Cookie ck:driver.manage().getCookies()) {
	bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
	bw.newLine();
	System.out.println(ck);
	
	
	}
	
	bw.close();
	fw.close();
	}
	
	catch(Exception e) {
	System.out.println(e);
	
	
	}
	
	
	}

	}


