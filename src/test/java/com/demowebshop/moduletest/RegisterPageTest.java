package com.demowebshop.moduletest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.RegisterPomClass;

public class RegisterPageTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		RegisterPomClass rp=new RegisterPomClass(driver);
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 FileInputStream fis = new FileInputStream("./src/main/resources/commondata.properties");
			Properties pobj = new Properties();
			pobj.load(fis);
			String fname=pobj.getProperty("First name");
			String lname=pobj.getProperty("Last name");
			String email=pobj.getProperty("Email");
			String pass=pobj.getProperty("Password");
			String confPass=pobj.getProperty("ConfirmPassword");
			
			rp.getFirstname().sendKeys(fname);
			rp.getLastname().sendKeys(lname);
			rp.getEmail().sendKeys(email);
			rp.getPassword().sendKeys(pass);
			rp.getConfirmpassword().sendKeys(confPass);
			rp.getRegisterbtn().click();  
}
}