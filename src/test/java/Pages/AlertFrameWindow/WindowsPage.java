package Pages.AlertFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {

    public WindowsPage(WebDriver driver) {
        super(driver);
    }

//    public WebDriver driver;
//
//    public WindowsPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    @FindBy(id = "tabButton")
    private WebElement newtabbutton;

    @FindBy(id = "windowButton")
    private WebElement newwindowbutton;



    public void interracttab(){
        newtabbutton.click();
        windowMethods.switchToSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificWindow(0);

//        System.out.println("Url: " + driver.getCurrentUrl());
//        List<String> tabs= new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
//        driver.switchTo().window(tabs.get(1)); //ne mutam focusul pe poztia tabului pe care vrem sa mergem - sa ramana si afisat
//        System.out.println("Url: " + driver.getCurrentUrl());
//        driver.close(); // inchide tab-ul pe care te afli- pe care esti focusat
//        driver.switchTo().window(tabs.get(0));
    }

    public void interractwindow(){
        newwindowbutton.click();
        windowMethods.switchToSpecificWindow(1);
        windowMethods.closeCurrentWindow();
        windowMethods.switchToSpecificWindow(0);


//        List<String> windows= new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
//        driver.switchTo().window(windows.get(1));
//        System.out.println("Url: " + driver.getCurrentUrl());
//        driver.close(); // inchide tab-ul pe care te afli- pe care esti focusat
//        driver.switchTo().window(windows.get(0));
    }
}
