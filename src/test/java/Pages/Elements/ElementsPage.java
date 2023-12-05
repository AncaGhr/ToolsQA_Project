package Pages.Elements;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }


//    public WebDriver driver;

//    public ElementsPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webtables;



    public void clickwebtables(){
        webtables.click();
    }


}
