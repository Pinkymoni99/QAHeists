package com.carrerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

// PageObjects we opened to reuse it 
//construct it--- means to initialize---to construct u will
//name as same title
//WebDriver drive; is instance variable nd the one inside
//(webDriver driver) is parameter
//u have two driver now to same page so mix it write this.driver = driver;
	
	WebDriver driver;
	
	public PageObjects(WebDriver driver) {
	
		this.driver = driver;
		//pagefactory use for pageobject
		
		PageFactory.initElements(driver, this);
		
	}
		//WebElement searchBox;
		//searchBox = driver.findElement(By.name("q"));
		//we will write in a shortcut way
	
	
	    @FindBy(name="q")
	    WebElement searchBox;
		
		//step2: perform action
		//searchBox.sendKeys(string);
	
		public void enterSearch(String text) {
			searchBox.sendKeys(text);
}

		//WebElement searchBtn;
		//searchBtn = driver.findElement(By.name("btnK"));
		 @FindBy(name = "btnK")
		 WebElement searchBtn;
		
		
		//searchBtn.click(); if that doesn't work use sendKeys
		//searchBtn.sendKeys(Keys.RETURN);
    
		 public void clickSearch() {
			 searchBtn.submit();
		 }

		 //WebElement resultStats;
			//resultStats = driver.findElement(By.id("result-stats"));
			
		 @FindBy(id = "result-stats")
			WebElement resultstats;
		 public void result() {
			 
			 System.out.println("===============");
				System.out.println(resultstats);
				System.out.println("==================="); 
			 
			 
		 }
			
			//String results = resultStats.getText();
			
           public void close() {
            driver.close();
           }
}

           









