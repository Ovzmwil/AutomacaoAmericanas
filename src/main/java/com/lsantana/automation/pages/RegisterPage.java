package com.lsantana.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	private WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='email-input']")
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@id='password-input']")
	WebElement txtSenha;
	
	@FindBy(xpath="//*[@id='cpf-input']")
	WebElement txtCpf;
	
	@FindBy(xpath="//*[@id='name-input']")
	WebElement txtNome;
	
	@FindBy(xpath="//*[@id='birthday-input']")
	WebElement txtDataNascimento;
	
	@FindBy(xpath="//*[text()='Masculino']")
	WebElement rdbSexoMasculino;
	
	@FindBy(xpath="//*[text()='Feminino']")
	WebElement rdbSexoFeminino;
	
	@FindBy(xpath="//*[@id='phone-input']")
	WebElement txtTelefone;
	
	@FindBy(xpath="//button[text()='Criar seu cadastro']")
	WebElement btnCriarCadastro;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}
	
	public void inputEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail));
		txtEmail.sendKeys(email);
	}
	
	public void inputSenha(String senha) {
		wait.until(ExpectedConditions.visibilityOf(txtSenha));
		txtSenha.sendKeys(senha);
	}
	
	public void inputCpf(String cpf) {
		wait.until(ExpectedConditions.visibilityOf(txtCpf));
		txtCpf.sendKeys(cpf);
	}
	
	public void inputNome(String nome) {
		wait.until(ExpectedConditions.visibilityOf(txtNome));
		txtNome.sendKeys(nome);
	}
	
	public void inputDataNascimento(String dataNascimento) {
		wait.until(ExpectedConditions.visibilityOf(txtDataNascimento));
		txtDataNascimento.sendKeys(dataNascimento);
	}
	
	public void clickOnMasculino() {
		wait.until(ExpectedConditions.visibilityOf(rdbSexoMasculino));
		rdbSexoMasculino.click();
	}
	
	public void clickOnFeminino() {
		wait.until(ExpectedConditions.visibilityOf(rdbSexoFeminino));
		rdbSexoFeminino.click();
	}
	
	public void inputTelefone(String telefone) {
		wait.until(ExpectedConditions.visibilityOf(txtTelefone));
		txtTelefone.sendKeys(telefone);
	}
	
	public void clickOnCriarCadastro() {
		wait.until(ExpectedConditions.visibilityOf(btnCriarCadastro));
		btnCriarCadastro.click();
	}
}
