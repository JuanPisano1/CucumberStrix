package org.Globant.steps.web;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Globant.configuration.web.UniqueWebDriver;
import org.Globant.reporting.Reporter;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;


/**
 * Represents the Hooks used for the EspnSteps class.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class WebHooks {

    private static UniqueWebDriver driver;
    private static final String URL = "https://strix.com.ar/home";
    private static final String BROWSER = "chrome";

    /**
     * Starts the browsers properly.
     */
    @Before
    public static void startBrowser() {
        driver = new UniqueWebDriver(BROWSER);
        driver.getDriver().manage().window().maximize();
        Reporter.info("Deleting all the cookies");
        driver.getDriver().manage().deleteAllCookies();
        driver.getDriver().get(URL);

    }
     @After
    public void closeBrowser() {
     driver.getDriver().quit();
    }


    public static WebDriver getDriver() {
        return driver.getDriver();
    }

}
