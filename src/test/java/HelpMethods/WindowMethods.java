package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
   private WebDriver driver;

    public WindowMethods(WebDriver driver) {

        this.driver = driver;
    }

    public void  switchToSpecificWindow(Integer size){

        List<String> tabs= new ArrayList<>(driver.getWindowHandles()); // lista de tab-uri
        driver.switchTo().window(tabs.get(size)); // pozitia tabului pe care vrem sa mergem - sa ramana si afisat
        System.out.println("Url: " + driver.getCurrentUrl());
    }

    public void closeCurrentWindow(){
        driver.close();

    }
}
