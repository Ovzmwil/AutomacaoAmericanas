package com.lsantana.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id='h_usr-link']")
	WebElement btnCadastreSe;
	
	@FindBy(xpath = "//*[text()='Cliente novo? Cadastrar']")
	WebElement btnClienteNovoCadastro;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	public void clickOnCadastreSe() {
		wait.until(ExpectedConditions.visibilityOf(btnCadastreSe));
		btnCadastreSe.click();
	}
	
	public void clickOnClienteNovoCadastro() {
		wait.until(ExpectedConditions.visibilityOf(btnClienteNovoCadastro));
		btnClienteNovoCadastro.click();
	}
}
