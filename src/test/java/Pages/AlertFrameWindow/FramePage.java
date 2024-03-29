package Pages.AlertFrameWindow;

import Logger.LoggerUtility;
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

    @FindBy(id = "sampleHeading")
    private WebElement frameText;

    public void interractFirstIFrame(){

        frameMethods.switchToFrame("frame1");
        LoggerUtility.info("The user switches on specific frame");

        System.out.println(frameText.getText());
        LoggerUtility.info("The user prints the frameText value");

        frameMethods.switchMainFrame();
        LoggerUtility.info("The user switches back to primary frame");


//        driver.switchTo().frame("frame1");
//        LoggerUtility.info("The user switched on specific frame");
//        System.out.println(frametext.getText());
//        LoggerUtility.info("The user prints the frametextvalue");
//        driver.switchTo().frame("frame1");
//        LoggerUtility.info("The user switched back on primary frame");
    }

    public void interractSecondIFrame(){

        frameMethods.switchToFrame("frame2");
        LoggerUtility.info("The user switches on second frame");

        System.out.println(frameText.getText());
        LoggerUtility.info("The user prints the frameText value");

//        driver.switchTo().frame("frame2");
//        LoggerUtility.info("The user switched on the second frame");
//        System.out.println(frametext.getText());
//        LoggerUtility.info("The user prints the frametext value");
    }
}
