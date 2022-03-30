package com.carrerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.carrerhack.common.GoogleBaseHeists;
import com.carrerhack.pages.PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHeists extends GoogleBaseHeists{
 
	//extends is used bcz we can call that here for launcg browser
	//since we used already extend for browser we can't do it again
	//so for page object PageObjects po =new PageObjects (driver);
	//po.enterSearch(string); call it here 
	

@Given("I am on google homepage")
public void i_am_on_google_homepage() {

	launchBrowser();
	
	
}	


@When("I enter a search {string}")
public void i_enter_a_search(String string) {
  //step 1: identify the web element and give the element a name
	//name is given bcz next time we call & 
	//selenium offer 8 locator which are
	//id,tag, name,class name,linktext,partial linktext, xpath, css-selector
	//step2: perform action
	
	//WebElement searchBox;
	//searchBox = driver.findElement(By.name("q"));
	
	//step2: perform action
	//searchBox.sendKeys(string);
	
	
	PageObjects po =new PageObjects (driver);
	po.enterSearch(string);
	
}

@When("I click on search button")
public void i_click_on_search_button() {
  //02/27/2022
	//WebElement searchBtn;
	//searchBtn = driver.findElement(By.name("btnK"));
	
	//searchBtn.click(); if that doesn't work use sendKeys
	//searchBtn.sendKeys(Keys.RETURN);
	
	PageObjects po =new PageObjects (driver);
	po.clickSearch();
	
	
}

@Then("I see the number of results return")
public void i_see_the_number_of_results_return() {
   //02/27/2022
	//WebElement resultStats;
	//resultStats = driver.findElement(By.id("result-stats"));
	
	
	//String results = resultStats.getText();
	
	//System.out.println("===============");
	//System.out.println(resultstats);
	//System.out.println("===================");
	
	PageObjects po =new PageObjects (driver);
	po.result();
	po.close();
}

	
	
	
	
}
