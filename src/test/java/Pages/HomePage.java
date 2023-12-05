package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

//    public WebDriver driver;
//
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']") // da posibilitatea sa imi gaseasca elem. dupa xpath
    private WebElement alertsframewindow;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement forms;

    @FindBy (xpath = "//h5[text()='Elements']")
    private WebElement elements;



    public void clickalertframewindow(){

        alertsframewindow.click();
    }

    public void clickforms(){
      forms.click();
    }


    public void clickelements(){
        elements.click();
    }
}
