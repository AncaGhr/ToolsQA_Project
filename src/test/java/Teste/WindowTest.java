package Teste;

import Pages.AlertFrameWindow.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.AlertFrameWindow.WindowsPage;
import ShareData.ShareData;
import ShareData.Hooks;

import org.testng.annotations.Test;

public class WindowTest extends Hooks {


    @Test

    public void testmethod() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickWindows();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interractTab();
        windowsPage.interractWindow();


//        WebElement alertsframewindow = getDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsframewindow.click();
//        WebElement browserwindows = getDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
//        browserwindows.click();

//        WebElement newtabbutton = getDriver().findElement(By.id("tabButton"));
//        newtabbutton.click();
//
//        System.out.println("Url: " + getDriver().getCurrentUrl());
//
//        List<String> tabs= new ArrayList<>(getDriver().getWindowHandles()); // lista de tab-uri
//        getDriver().switchTo().window(tabs.get(1)); // poztia tabului pe care vrem sa mergem - sa ramana si afisat
//        System.out.println("Url: " + getDriver().getCurrentUrl());
//        getDriver().close(); // inchide tab-ul pe care te afli- pe care esti focusat
//        getDriver().switchTo().window(tabs.get(0));

//        WebElement newwindowbutton = getDriver().findElement(By.id("windowButton"));
//        newwindowbutton.click();
//
//        List<String> windows= new ArrayList<>(getDriver().getWindowHandles()); // lista de tab-uri
//        getDriver().switchTo().window(windows.get(1));
//        System.out.println("Url: " + getDriver().getCurrentUrl());
//        getDriver().close(); // inchide tab-ul pe care te afli- pe care esti focusat
//        getDriver().switchTo().window(tabs.get(0));


    }
}
