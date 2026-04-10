package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CreateAccountPage;
import pages.LoginPage;
import utils.CommonUtils;

public class CreateAccountTest extends BaseTest {

    @Test
    public void verifyCountryDropdown() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickCreateAccount();

        CreateAccountPage accountPage =
                new CreateAccountPage(driver);


		  accountPage.enterNameAndSelectRediffId();
		  accountPage.enterPassword();
          accountPage.selectDOB();

        Select countrySelect =
                accountPage.getCountryDropdown();

        CommonUtils.printDropdownValues(countrySelect);

        countrySelect.selectByVisibleText("India");

        String selectedCountry =
                countrySelect.getFirstSelectedOption().getText();

        System.out.println("Selected Country: " + selectedCountry);

        Assert.assertEquals(selectedCountry, "India");
    }
}
