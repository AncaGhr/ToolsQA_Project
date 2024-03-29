package Teste;

import ObjectData.FormTableObject;
import ObjectData.WebTableObject;
import Pages.Elements.ElementsPage;
import Pages.Forms.PracticeFormsPage;
import Pages.HomePage;
import Pages.Elements.WebTablePage;
import ShareData.ShareData;
import ShareData.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import javax.sound.midi.ShortMessage;

public class WebTableTest extends Hooks {


    @Test

    public void testmethod(){

        WebTableObject webTableObject = new WebTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickConsent();
        homePage.clickElements();


        JavascriptExecutor JS = (JavascriptExecutor) getDriver();
        JS.executeScript("window.scrollBy(0,450)", "");

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWebTables();

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(webTableObject);

//        String firstnamevalue = "Anca";
//        String lastnamevalue = "Ghr";
//        String emailvalue = "anca@example.com";
//        String agevalue = "22";
//        String salaryvalue = "10000";
//        String departamentvalue = "IT";

//        WebTablePage webTablePage = new WebTablePage(getDriver());
//        webTablePage.addnewentry(firstnamevalue,lastnamevalue, emailvalue, agevalue, salaryvalue,departamentvalue);

//        WebElement elements = getDriver().findElement(By.xpath("//h5[text()='Elements']"));
//
//        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
//        jse.executeScript("window.scrollBy(0,350)");
//
//        Actions action = new Actions(getDriver());
//        action.moveToElement(elements).perform();
//        elements.click();
//
//        WebElement webtables = getDriver().findElement(By.xpath("//span[text()='Web Tables']"));
//        webtables.click();

//        List<WebElement> actualentries = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer actualtablesize = actualentries.size();
//
//        WebElement addbuton = getDriver().findElement(By.id("addNewRecordButton"));
//        addbuton.click();
//
//        WebElement firstname = getDriver().findElement(By.id("firstName"));
//        String firstnamevalue = "Anca";
//        firstname.sendKeys(firstnamevalue);
//
//        WebElement lastname = getDriver().findElement(By.id("lastName"));
//        String lastnamevalue = "Ghr";
//        lastname.sendKeys(lastnamevalue);
//
//        WebElement email = getDriver().findElement(By.id("userEmail"));
//        String emailvalue = "anca@example.com";
//        email.sendKeys(emailvalue);
//
//        WebElement age = getDriver().findElement(By.id("age"));
//        String agevalue = "22";
//        age.sendKeys(agevalue);
//
//        WebElement salary = getDriver().findElement(By.id("salary"));
//        String salaryvalue = "10000";
//        salary.sendKeys(salaryvalue);
//
//        WebElement departament = getDriver().findElement(By.id("department"));
//        String departamentvalue = "IT";
//        departament.sendKeys(departamentvalue);
//
//        WebElement submitbuton = getDriver().findElement(By.id("submit"));
//        submitbuton.click();
//
//        List<WebElement> expectedentries = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer expectedtablesize = expectedentries.size();
//
//        Assert.assertTrue(actualtablesize+1 == expectedtablesize);
//
//        String lastentrytable = expectedentries.get(actualtablesize).getText();
//
//        Assert.assertTrue(lastentrytable.contains(firstnamevalue));
//        Assert.assertTrue(lastentrytable.contains(lastnamevalue));
//        Assert.assertTrue(lastentrytable.contains(emailvalue));
//        Assert.assertTrue(lastentrytable.contains(agevalue));
//        Assert.assertTrue(lastentrytable.contains(salaryvalue));
//        Assert.assertTrue(lastentrytable.contains(departamentvalue));

    }

}
