package com.placido.prova.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	private WebDriver driver;
	private String url = "https://www.grocerycrud.com/demo/bootstrap_theme";

	By comboValues = By.id("switch-version-select");
	By addCustomerBtn = By.linkText("Add Customer");

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void visit() {
		driver.get(url);
	}

	public void selecionaBootstrapV4Theme() {
		Select comboValues = new Select(driver.findElement(By.id("switch-version-select")));
		comboValues.selectByVisibleText("Bootstrap V4 Theme");
	}

	public void addCustomer() {
		WebElement addCustomerBtn = driver.findElement(By.linkText("Add Customer"));
		addCustomerBtn.click();
	}
	

}
