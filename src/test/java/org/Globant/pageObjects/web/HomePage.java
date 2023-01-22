package org.Globant.pageObjects.web;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import org.Globant.reporting.Reporter;
import org.Globant.utils.web.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;



public class HomePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"initialModal\"]/div/div/div[1]/button")
     WebElement Modal;

    @FindBy(xpath = "/html/body/header/div[2]/div/div/div[1]")
    WebElement Auto;

    public HomePage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void IngresoHomePage() throws InterruptedException {
        waitForClickable(Modal);
        Modal.click();
    }
    public void SelecciónAuto() throws InterruptedException {

        waitForClickable(Auto);
        Auto.click();
    }
}