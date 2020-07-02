package com.placido.prova.tests;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.placido.prova.pages.BasePage;
import com.placido.prova.pages.FormPage;

public class CadastroUserTest {
	private WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		BasePage basepage = new BasePage(driver);
		basepage.visit();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test()
	public void cadastroUsuarioTest() {

		BasePage basepage = new BasePage(driver);
		FormPage formpage = new FormPage(driver);
		
		basepage.selecionaBootstrapV4Theme();
		basepage.addCustomer();
		formpage.fillName("Teste Sicredi");
		formpage.fillLname("Teste");
		formpage.fillcname("seu nome");
		formpage.fillphone("51 9999-9999");
		formpage.filladdress1("Av Assis Brasil, 3970");
		formpage.filladdress2("Torre D");
		formpage.fillCity("Porto Alegre");
		formpage.fillState("RS");
		formpage.fillPcode("91000-000");
		formpage.fillCountry("Brasil");
		formpage.dropdownEmp("Fixter");
		formpage.fillClimit("200");
		formpage.btnSave();
		assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list", formpage.messageP());

	}

}
