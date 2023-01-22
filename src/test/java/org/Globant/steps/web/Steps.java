package org.Globant.steps.web;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Globant.pageObjects.web.HomePage;

import org.Globant.reporting.Reporter;

import static org.Globant.steps.web.WebHooks.getDriver;


/**
 * Represents the tests cases used in the ESPN landing page.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */


public class Steps {


    public HomePage home;


    /**
     * Takes the user to the ESPN landing page.
     */
    @Given("El usuario ingresó a la Home")
    public void IngresodeUsuario() throws InterruptedException {

        this.home = new HomePage(getDriver());
        home.IngresoHomePage();
        Reporter.info("Usuario Cerró el modal");

    }

    /**
     * The user enters valid credentials for sign up.
     */
    @When("El usuario selecciona Auto")
    public void SeleccionaAuto() throws InterruptedException {
        home.SelecciónAuto();
        Reporter.info("Usuario Seleccionó Auto");
    }


    @And("the user clicks the search button")
    public void theUserNavigatesToTheWatchPage() {

    }

    @Then("the dresses page appears")
    public void theUserSNameDoesNotAppearedInTheWelcomeMessage() throws InterruptedException {
    Reporter.info("Se cierra el Browser");
    Thread.sleep(6000);
    //getDriver().quit();
    }
}
