package Pages.Forms;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends BasePage {

    public FormsPage(WebDriver driver) {
        super(driver);
    }

//    public WebDriver driver;
//
//    public FormsPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceforms;



    public void clickPracticeForm(){
        practiceforms.click();
    }


}
