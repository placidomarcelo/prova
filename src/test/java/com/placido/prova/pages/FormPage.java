package com.placido.prova.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FormPage {
	
	
	private WebDriver driver;


	public FormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillName (String nome) {
		WebElement name = driver.findElement(By.id("field-customerName"));
		name.sendKeys(nome);
	}
	
	public void fillLname (String sName) {
		WebElement lastName = driver.findElement(By.id("field-contactLastName"));
		lastName.sendKeys(sName);
	}
	
	public void fillcname (String cfname) {
		WebElement contactFirstName = driver.findElement(By.id("field-contactFirstName"));
		contactFirstName.sendKeys(cfname);
	}
	
	public void fillphone (String fone) {
		WebElement phone = driver.findElement(By.id("field-phone"));
		phone.sendKeys(fone);
	}
	
	public void filladdress1 (String addressL1) {
		WebElement addressLine1 = driver.findElement(By.id("field-addressLine1"));
		addressLine1.sendKeys(addressL1);
	}
	
	public void filladdress2 (String addressL2) {
		WebElement addressLine2 = driver.findElement(By.id("field-addressLine2"));
		addressLine2.sendKeys(addressL2);
	}
	
	public void fillCity (String cidade) {
		WebElement city = driver.findElement(By.id("field-city"));
		city.sendKeys(cidade);
	}
	
	public void fillState (String estado) {
		WebElement state  = driver.findElement(By.id("field-state"));
		state.sendKeys(estado);
	}
	
	public void fillPcode (String cep) {
		WebElement postalCode  = driver.findElement(By.id("field-postalCode"));
		postalCode.sendKeys(cep);
	}
	
	public void fillCountry (String pais) {
		WebElement country  = driver.findElement(By.id("field-country"));
		country.sendKeys(pais);
	}
	
	public void dropdownEmp (String choose) {
		WebElement combo = driver.findElement(By.xpath("//*[@id='field_salesRepEmployeeNumber_chosen']/a/div/b"));
		combo.click();
		WebElement comboEntry = driver.findElement(By.xpath("//*[@id=\'field_salesRepEmployeeNumber_chosen\']/div/div"));
		comboEntry.click();
		WebElement comboSearch = driver.findElement(By.xpath("//*[@id=\'field_salesRepEmployeeNumber_chosen\']/div/div/input"));
		comboSearch.sendKeys(choose);
		WebElement comboResult = driver.findElement(By.xpath("//*[@id='field_salesRepEmployeeNumber_chosen']/div/ul/li/em"));
		comboResult.click(); 
	}
	
	public void fillClimit (String cLimit) {
		WebElement creditLimit  = driver.findElement(By.id("field-creditLimit"));
		creditLimit.sendKeys(cLimit);
	}
	
	public void btnSave () {
		WebElement saveBtn  = driver.findElement(By.id("form-button-save"));
		saveBtn.click();
	}
	
	public String messageP() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement messagePop = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'report-success\']/p")));
		return messagePop.getText();
		
	}
	
	
}
