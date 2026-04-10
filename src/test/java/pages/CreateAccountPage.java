
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.WaitUtils;

public class CreateAccountPage {

    @FindBy(xpath = "//input[@placeholder='Enter your full name']")
    private WebElement fullName;

    @FindBy(xpath = "//input[@placeholder='Enter Rediffmail ID']")
    private WebElement rediffId;

    @FindBy(css = "input.btn_checkavail")
    private WebElement checkAvailabilityBtn;

    @FindBy(xpath = "(//input[@type='radio' and contains(@name,'radio_login')])[1]")
    private WebElement firstSuggestedId;

    @FindBy(id = "newpasswd")
    private WebElement password;

    @FindBy(id = "newpasswd1")
    private WebElement confirmPassword;

    @FindBy(css = "select.day")
    private WebElement day;

    @FindBy(css = "select.month")
    private WebElement month;

    @FindBy(css = "select.year")
    private WebElement year;

    @FindBy(id = "country")
    private WebElement countryDropdown;

    public CreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterNameAndSelectRediffId() {

        fullName.sendKeys("Kamal");
        WaitUtils.hardWait(1500);

        rediffId.sendKeys("kamal1234");
        WaitUtils.hardWait(1500);

        checkAvailabilityBtn.click();
        WaitUtils.hardWait(3000);

        firstSuggestedId.click();
        WaitUtils.hardWait(2000);
    }

    public void enterPassword() {
        password.sendKeys("Kamal@1234");
        WaitUtils.hardWait(1000);

        confirmPassword.sendKeys("Kamal@1234");
        WaitUtils.hardWait(1000);
    }

    public void selectDOB() {

        new Select(day).selectByValue("20");
        WaitUtils.hardWait(1000);

        new Select(month).selectByValue("06");
        WaitUtils.hardWait(1000);

        new Select(year).selectByVisibleText("2000");
        WaitUtils.hardWait(1000);
    }

    public Select getCountryDropdown() {
        return new Select(countryDropdown);
    }
}
