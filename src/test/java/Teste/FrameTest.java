package Teste;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class FrameTest extends  ShareData {

    @Test

    public void testmethod() {

//        WebElement alertsframewindow = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsframewindow.click();

        HomePage homePage = new HomePage(getDriver());
        homePage.clickalertframewindow();

//        WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frames.click();


        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();
        FramePage framePage = new FramePage(getDriver());
        framePage.interractfirstiframe();
        framePage.interractsecondiframe();

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
