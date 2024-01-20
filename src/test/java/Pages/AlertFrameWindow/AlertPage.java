package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
import ObjectData.AlertObject;
import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(id = "alertButton")
    private WebElement alertaOkButton;

    @FindBy (id = "timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "promtButton" )
    private  WebElement promtButton;



    public void interractAlertOK(){

        elementMethods.clickElement(alertaOkButton);
        LoggerUtility.info("The user clicks on alertaOkButton");

        alertMethods.acceptAlert();
        LoggerUtility.info("The user clicks on acceptAlert");

//           alertaOkButton.click();
//        alertMethods.acceptAlert();
//        Alert alertok = driver.switchTo().alert();
//        alertok.accept();
    }

    public void interractAlertDelay(){

        elementMethods.clickElement(alertDelayButton);
        LoggerUtility.info("The user clicks on alertDelayButton");

        alertMethods.acceptAlert();
        LoggerUtility.info("The user clicks on acceptAlert");

//        alertdelaybutton.click();
//        alertMethods.acceptAlert();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait explicit trb sa aiba conditie
//        wait.until(ExpectedConditions.alertIsPresent()); // conditia pt wait explicit
//        Alert alertdelay = driver.switchTo().alert();
//        alertdelay.accept();
    }

    public void interractAlertDismiss(){

        elementMethods.clickElement(confirmButton);
        LoggerUtility.info("The user clicks on confirmButton");

        alertMethods.cancelAlert();
        LoggerUtility.info("The user clicks on cancelAlert");
    }

    public void interractAlertValue(AlertObject alertObject){

        elementMethods.clickElement(promtButton);
        LoggerUtility.info("The user clicks on promtButton");

        alertMethods.fillAlert(alertObject.getPromptAlertValue());
        LoggerUtility.info("The user writes a message and clicks Ok button");

//        alertvaluebutton.click();
//        alertMethods.fillAlert(value);
//        Alert alertvalue = driver.switchTo().alert();
//        alertvalue.sendKeys(value);
//        alertvalue.accept();

    }

}
