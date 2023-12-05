package Pages.AlertFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

//    public WebDriver driver;
//
//    public FramePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    @FindBy(id = "sampleHeading")
    private WebElement frametext;



    public void interractfirstiframe(){
        frameMethods.switchToFrame("frame1");
        System.out.println(frametext.getText());
        frameMethods.switchMainFrame();
    }

    public void interractsecondiframe(){
        frameMethods.switchToFrame("frame2");
        System.out.println(frametext.getText());
    }


}
