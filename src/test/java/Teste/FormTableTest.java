package Teste;

import ObjectData.FormTableObject;
import Pages.HomePage;
import Pages.Forms.FormsPage;
import Pages.Forms.PracticeFormsPage;
import ShareData.ShareData;
import org.testng.annotations.Test;
import ShareData.Hooks;
import java.util.List;

public class FormTableTest extends Hooks { //in loc de Share Data am pus Hooks

    @Test

    public void testmethod() {

        FormTableObject formTableObject = new FormTableObject(testData);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickForms();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.clickPracticeForm();

        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getDriver());
        practiceFormsPage.fillPracticeForm(formTableObject);

        List<String> Formvalues = practiceFormsPage.getValuesForms();
        practiceFormsPage.fillsubmit();

        practiceFormsPage.clickClose();



//        String firstnamevalue = "Anca";
//        String lastnamevalue = "Ghr";
//        String emailadress = "anca@example.com";
//        String mobilevalue = "0720100200";
//        String subjectsvalue = "English";
//        String adressvalue = "Str. X, Nr. Y";
//        String statevalue = "NCR";
//        String cityvalue = "Delhi";
//        String expectedmessage = "Thanks for submitting the form";



//        practiceFormsPage.validatePracticeForm(expectedmessage, firstnamevalue, lastnamevalue, emailadress,
//                formValues.get(0), mobilevalue, subjectsvalue, formValues.get(1), adressvalue, statevalue, cityvalue);
//
//        practiceFormsPage.clickclose();


//        WebElement forms = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        forms.click();

//        WebElement practiceforms = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        practiceforms.click();

//        WebElement firstname = driver.findElement(By.id("firstName"));
//        String firstnamevalue = "Anca";
//        firstname.sendKeys(firstnamevalue);
//
//        WebElement lastname = driver.findElement(By.id("lastName"));
//        String lastnamevalue = "Ghr";
//        lastname.sendKeys(lastnamevalue);

//        WebElement email = driver.findElement(By.id("userEmail"));
//        String emailadress = "anca@example.com";
//        email.sendKeys(emailadress);

//        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        gender.click();
//        String gendervalue = gender.getText();

//        WebElement mobile = driver.findElement(By.id("userNumber"));
//        String mobilevalue = "0720100200";
//        mobile.sendKeys(mobilevalue);

//        WebElement subjects = driver.findElement(By.id("subjectsInput"));
//        String subjectsvalue= "English";
//        subjects.sendKeys(subjectsvalue);
//        subjects.sendKeys(Keys.ENTER);

//        WebElement reading = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
//        reading.click();
//        String readingvalue = reading.getText();

//        WebElement choosefile = driver.findElement(By.id("uploadPicture"));
//        File file = new File("src/test/resources/Eu color.jpg");
//        choosefile.sendKeys(file.getAbsolutePath());

//        WebElement adress = driver.findElement(By.id("currentAddress"));
//        String adressvalue = "Str. X, Nr. Y";
//        adress.sendKeys(adressvalue);

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,350)");

//        WebElement state =  driver.findElement(By.id("state"));
//        state.click();
//
//        WebElement selectstate = driver.findElement(By.id("react-select-3-input"));
//        String statevalue = "NCR";
//        selectstate.sendKeys(statevalue);
//        selectstate.sendKeys(Keys.ENTER);

//        WebElement city =  driver.findElement(By.id("city"));
//        city.click();
//
//        WebElement selectcity =  driver.findElement(By.id("react-select-4-input"));
//        String cityvalue = "Delhi";
//        selectcity.sendKeys(cityvalue);
//        selectcity.sendKeys(Keys.ENTER);

//        WebElement submitbutton =  driver.findElement(By.id("submit"));
//        jse.executeScript("arguments[0].click();", submitbutton);


    }

}
