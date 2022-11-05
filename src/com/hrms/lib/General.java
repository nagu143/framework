package com.hrms.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.log;

public class General extends Global{
 //Rule -All re-usable fun:
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","D:\\SoftwareTestingData\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	log.info("Application opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
	    driver.findElement(By.name(btn_login)).click();
	    System.out.println("Login completed");
	    log.info("LOgin completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_login)).click();
		System.out.println("Logout completed");
		log.info("Logout completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(frm_AddEMP);
		System.out.println("Entered into frame");
		log.info("Entered into frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");	
		log.info("exit from frame");
	}
	public void addEmp()throws Exception{
		driver.findElement(By.xpath(btn_Add)).click();
		Thread.sleep(3000);
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Adding new emp");
		log.info("Adding new emp");
		Thread.sleep(3000);
	}

}
