package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {

    private WebDriver driver;

    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait explicit trb sa aiba conditie
        wait.until(ExpectedConditions.alertIsPresent()); // conditia pt wait explicit
    }

    public void acceptAlert(){
        waitForAlert();
        Alert alertok = driver.switchTo().alert();
        alertok.accept();
    }
    public void cancelAlert(){
        waitForAlert();
        Alert alertokcancel = driver.switchTo().alert();
        alertokcancel.dismiss(); // accept = ok si dismiss = cancel
    }

    public void fillAlert(String value){
        waitForAlert();
        Alert alertvalue = driver.switchTo().alert();
        alertvalue.sendKeys(value);
        alertvalue.accept();
    }
}
