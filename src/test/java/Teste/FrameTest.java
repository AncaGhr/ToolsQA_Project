package Teste;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;
import ShareData.Hooks;

public class FrameTest extends Hooks {

    @Test

    public void testmethod() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickalertframewindow();


        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();

        FramePage framePage = new FramePage(getDriver());
        framePage.interractFirstIFrame();
        framePage.interractSecondIFrame();



        //        WebElement alertsframewindow = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsframewindow.click();

//        WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frames.click();

//        driver.switchTo().frame("frame1");
//
//        WebElement frametext = driver.findElement(By.id("sampleHeading"));
//        System.out.println(frametext.getText());
//
//        driver.switchTo().defaultContent(); //intoarce focusul pe pagina mare;

//        driver.switchTo().frame("frame2");
//
//        WebElement frame2text = driver.findElement(By.id("sampleHeading"));
//        System.out.println(frame2text.getText());

    }

}
