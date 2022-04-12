package steps;

import base.FrameworkConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.CommonFunctions;
import pages.HomePage;
import pages.LoginPage;

public class stepdefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://dev-hsbc-priss1/login");

    }

        @And("I click login button")
    public void iClickLoginButton() {

     loginPage.clickLoginButton();
    }

    @And("I enter the username as  {string}")
    public void iEnterTheUsernameAs(String userName) {

        loginPage.captureUsernameField(userName);
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {

        loginPage.capturePasswordField(password);
    }

    @And("I click Create Composite button")
    public void iClickCreateCompositeButton() {
        homePage.clickCreateComposite();
    }

    @And("I enter the issuer name as {string}")
    public void iEnterTheIssuerNameAs(String issuerName) {
        CommonFunctions.enterTextInTextBox("Issuer Name",issuerName);
    }

    @And("I click category and ratings tab")
    public void iClickCategoryAndRatingsTab() {
        homePage.clickRatings();
    }

    @And("I click submit button")
    public void iClickSubmitButton() {
        homePage.clickSubmitButton();
    }

    @And("I click cancel button")
    public void iClickCancelButton() {
        homePage.clickCancelButton();
    }

    @And("I click the Implementation tab")
    public void iClickTheImplementationTab() {
        homePage.clickImplemenationTab();
    }

    @And("I click  the close book button")
    public void iClickTheCloseBookButton() {
        homePage.clickCloseBookButton();
    }

    @And("I click close book now button")
    public void iClickCloseBookNowButton() {
        homePage.clickCloseBookNow();
    }

    @And("I click send to bookrunners button")
    public void iClickSendToBookrunnersButton() {
        homePage.clickSendToBookrunners();
    }

    @And("I click the Infor Trail tab")
    public void iClickTheInforTrailTab() {
        homePage.clickInforTrailTab();
    }

    @And("I click the Decision screen")
    public void iClickTheDecisionScreen() {
        homePage.clickDecisionTab();
    }

    @And("I click the joint bookrunners checkbox")
    public void iClickTheJointBookrunnersCheckbox() {
    homePage.clickJointBookrunnersChecbox();

    }

    @And("I click the Category and Ratings tab")
    public void iClickTheCategoryAndRatingsTab() {
        homePage.clickRatings();
    }

    @And("I click  the billing bank")
    public void iClickTheBillingBank() {

    }

    @And("I click timer radio button")
    public void iClickTimerRadioButton() {
        homePage.clickTimerRadioButton();
    }

    @And("I click  the close book")
    public void iClickTheCloseBook() {
        homePage.clickCloseBooksButton();
    }

    @And("I enter the issuer tranche name as {string}")
    public void iEnterTheIssuerTrancheNameAs(String trancheName) {
        CommonFunctions.enterTextInTextBox("Issuer Tranche Name",trancheName);
    }

    @And("I click on registration type")
    public void iClickOnRegistrationType() throws InterruptedException {
        CommonFunctions.selectDropDownElementForHSBC("Registration Type","144A/Reg S");

        //CommonFunctions.selectDropDownElementForHSBC("Deal Status","Announced");
        //Thread.sleep(2000);
    }

    @And("I enter the Maturity date")
    public void iEnterTheMaturityDate() {
        CommonFunctions.typeCurrentDate("Maturity Date","12/12/2026");
    }

    @And("I enter the Tranche currency")
    public void iEnterTheTrancheCurrency() {
        CommonFunctions.selectDropDownElementForHSBC("Currency","CNY");
    }

    @And("I click the Primary Issuance activity tab")
    public void iClickThePrimaryIssuanceActivityTab() {
        homePage.clickPrimaryIssuanceTab();
    }
}
