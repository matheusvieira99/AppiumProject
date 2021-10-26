package com.appium.studio.paginas;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BasePage {
	protected RemoteWebDriver driver;
	
	
	public BasePage(RemoteWebDriver driver) {
		super();
		this.driver = driver;
	}



	public void pressionarEnter() {
		driver.executeScript("seetest:client.deviceAction(\"Enter\")");
	}
	
	public void tirarScreenshot() throws IOException {
		String path;
		File batatinha = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		path = "C:\\Users\\Matheus\\Downloads\\" + batatinha.getName();
        FileUtils.copyFile(batatinha, new File(path));
	}
	
	public void resultadoEsperadoPlaylist() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='play_pause_button']")).isDisplayed());
	}
	
	public void resultadoEsperadoPesquisa() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Featuring blink-182']")).isDisplayed());
	}
	

}
