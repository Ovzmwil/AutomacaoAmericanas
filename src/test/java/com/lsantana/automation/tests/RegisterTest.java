package com.lsantana.automation.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lsantana.automation.pages.HomePage;
import com.lsantana.automation.pages.RegisterPage;

public class RegisterTest {
	
	WebDriver driver;
	HomePage homePage;
	RegisterPage registerPage;
	
	@BeforeClass
	public static void set() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	}
	
	@Before
	public void init() {
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		registerPage = new RegisterPage(driver);
		homePage.clickOnCadastreSe();
		homePage.clickOnClienteNovoCadastro();
	}
	
	@Test
	public void cadastroCompleto() {
		registerPage.inputEmail(email);
		registerPage.inputSenha(senha);
		registerPage.inputCpf(cpf);
		registerPage.inputNome(nome);
		registerPage.inputDataNascimento(dataNascimento);
		registerPage.clickOnMasculino();
		registerPage.inputTelefone(telefone);
		registerPage.clickOnCriarCadastro();
	}
	
	@Test
	public void cadastroSemEmail() {
		registerPage.inputEmail(email);
		registerPage.inputSenha(senha);
		registerPage.inputCpf(cpf);
		registerPage.inputNome(nome);
		registerPage.inputDataNascimento(dataNascimento);
		registerPage.clickOnMasculino();
		registerPage.inputTelefone(telefone);
		registerPage.clickOnCriarCadastro();
	}
	
	@Test
	public void cadastroSemCpf() {
		registerPage.inputEmail(email);
		registerPage.inputSenha(senha);
		registerPage.inputCpf(cpf);
		registerPage.inputNome(nome);
		registerPage.inputDataNascimento(dataNascimento);
		registerPage.clickOnMasculino();
		registerPage.inputTelefone(telefone);
		registerPage.clickOnCriarCadastro();
	}
	
	@Test
	public void cadastroSemNome() {
		registerPage.inputEmail(email);
		registerPage.inputSenha(senha);
		registerPage.inputCpf(cpf);
		registerPage.inputNome(nome);
		registerPage.inputDataNascimento(dataNascimento);
		registerPage.clickOnMasculino();
		registerPage.inputTelefone(telefone);
		registerPage.clickOnCriarCadastro();
	}

}
