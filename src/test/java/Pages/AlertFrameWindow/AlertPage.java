package Pages.AlertFrameWindow;

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

//    public WebDriver driver;
//
//    public AlertPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    @FindBy(id = "alertButton")
    private WebElement alertokbutton;

    @FindBy (id = "timerAlertButton")
    private WebElement alertdelaybutton;

    @FindBy(id = "confirmButton")
    private WebElement alertokcancelbutton;

    @FindBy(id = "promtButton" )
    private  WebElement alertvaluebutton;



    public void interractalertok(){
        alertokbutton.click();
        alertMethods.acceptAlert();
//        Alert alertok = driver.switchTo().alert();
//        alertok.accept();
    }

    public void interractalertdelay(){
        alertdelaybutton.click();
        alertMethods.acceptAlert();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait explicit trb sa aiba conditie
//        wait.until(ExpectedConditions.alertIsPresent()); // conditia pt wait explicit
//        Alert alertdelay = driver.switchTo().alert();
//        alertdelay.accept();
    }

    public void interractalertdismiss(){
        alertokcancelbutton.click();
        alertMethods.cancelAlert();
//        Alert alertokcancel = driver.switchTo().alert();
//        alertokcancel.dismiss(); // accept = ok si dismiss = cancel
    }

    public void interractalertvalue(String value){
        alertvaluebutton.click();
        alertMethods.fillAlert(value);
//        Alert alertvalue = driver.switchTo().alert();
//        alertvalue.sendKeys(value);
//        alertvalue.accept();

    }

}
