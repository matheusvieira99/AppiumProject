package com.appium.studio.tests;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.appium.studio.paginas.HomePage;
import com.appium.studio.paginas.SearchPage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class BaseTest {
//    private String reportDirectory = "reports";
//    private String reportFormat = "xml";
//    private String testName = "ValidarPesquisaSpotify";
    protected RemoteWebDriver driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    HomePage homePage;
    SearchPage searchPage;
    
    @Before
    public void setUp() throws MalformedURLException {
//        dc.setCapability("reportDirectory", reportDirectory);
//        dc.setCapability("reportFormat", reportFormat);
//        dc.setCapability("testName", testName);
//        dc.setCapability(MobileCapabilityType.UDID, "RX8M80960CV");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.spotify.music");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
//        dc.setCapability("instrumentApp", true);
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub/"), dc);
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.setLogLevel(Level.INFO);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
