package Teste;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.AlertFrameWindow.AlertPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class AlertTest extends ShareData {

    @Test
    public void testmethod() {


        HomePage homePage = new HomePage(getDriver());
        homePage.clickalertframewindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickAlerts();

        AlertPage alertPage = new AlertPage(getDriver());

        alertPage.interractalertok();
        alertPage.interractalertdelay();
        alertPage.interractalertdismiss();
        alertPage.interractalertvalue("Text");









//        WebElement alerts = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        alerts.click();


//        WebElement alertokbutton = driver.findElement(By.id("alertButton")); // obiect de tip alert pt a ne muta focusul - obiectiv (apertura) pe site
//        alertokbutton.click();
//        Alert alertok = driver.switchTo().alert();
//        alertok.accept();

//        WebElement alertdelaybutton = driver.findElement(By.id("timerAlertButton"));
//        alertdelaybutton.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait explicit trb sa aiba conditie
//        wait.until(ExpectedConditions.alertIsPresent()); // conditia pt wait explicit
//
//        Alert alertdelay = driver.switchTo().alert();
//        alertdelay.accept();

//        WebElement alertokcancelbutton = driver.findElement(By.id("confirmButton"));
//        alertokcancelbutton.click();
//
//        Alert alertokcancel = driver.switchTo().alert();
//        alertokcancel.dismiss(); // accept = ok si dismiss = cancel

//        WebElement alertvaluebutton = driver.findElement(By.id("promtButton"));
//        alertvaluebutton.click();
//
//        Alert alertvalue = driver.switchTo().alert();
//        alertvalue.sendKeys("OK");
//        alertvalue.accept();


    }


}
