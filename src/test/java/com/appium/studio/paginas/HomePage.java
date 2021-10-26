package com.appium.studio.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends BasePage {

	public HomePage(RemoteWebDriver driver) {
		super(driver);
	}
	
	public void irParaPaginaSearch() {
		 driver.findElement(By.xpath("//*[@contentDescription='Search']")).click();
	}

}
