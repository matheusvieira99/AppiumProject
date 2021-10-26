package com.appium.studio.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPage extends BasePage {

	public SearchPage(RemoteWebDriver driver) {
		super(driver);

	}
	
	public void selecionarCampoDePesquisa() {
		driver.findElement(By.xpath("//*[@text='Artists, songs, or podcasts']")).click();
	}
	
	public void escreverPesquisa(String pesquisa) {
		driver.findElement(By.xpath("//*[@id='query']")).sendKeys(pesquisa);
	}
	
	public void clicarNaPlaylist() {
		driver.findElement(By.xpath("(//*[@id='search_body']/*/*/*[@id='labels'])[1]")).click();

	}
	
	public void acionarBtnPlay() {
		driver.findElement(By.xpath("//*[@id='button_play']")).click();
	}
	

}
