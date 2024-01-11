package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']") // da posibilitatea sa imi gaseasca elem. dupa xpath
    private WebElement alertsFrameWindow;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement forms;

    @FindBy (xpath = "//h5[text()='Elements']")
    private WebElement elements;


    public void clickAlertWindow(){
        alertsFrameWindow.click();
        LoggerUtility.info("The user clicks on alertsframewindow button");
    }

    public void clickForms(){
      forms.click();
        LoggerUtility.info("The user clicks on Forms button");
    }


    public void clickElements(){
        elements.click();
        LoggerUtility.info("The user clicks on Elements button");
    }

}
