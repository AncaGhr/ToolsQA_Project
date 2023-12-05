package Pages.Forms;

import Pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormsPage extends BasePage {

    public PracticeFormsPage(WebDriver driver) {
        super(driver);
    }

//    public WebDriver driver;
//
//    public PracticeFormsPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }

    @FindBy(id = "firstName")
    private WebElement firstname;

    @FindBy(id = "lastName")
    private WebElement lastname;


    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement gender;

    @FindBy(id = "userNumber")
    private WebElement mobile;

    @FindBy(id = "subjectsInput")
    private WebElement subjects;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement reading;

    @FindBy(id = "uploadPicture")
    private WebElement choosefile;

    @FindBy(id = "currentAddress")
    private WebElement adress;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "react-select-3-input")
    private WebElement selectstate;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "react-select-4-input")
    private WebElement selectcity;

    @FindBy(id = "submit")
    private WebElement submitbutton;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement thanksmessage;

    @FindBy(css = ".table-dark>tbody>tr")
    private List<WebElement> validationtable;

    @FindBy(id = "closeLargeModal")
    private WebElement closebutton;



    public void fillPracticeForm(String firstname, String lastname, String email, String mobile,
                                 String subjects, String adress, String state, String city) {
        fillfirstName(firstname);
        fillLastName(lastname);
        fillemail(email);
        fillgender();
        fillmobile(mobile);
        fillsubjects(subjects);
        fillreading();
        filladress(adress);
        fillstate(state);
        fillcity(city);
    }

    public List<String> getValuesForms() {
        List<String> formValues = new ArrayList<>();
        formValues.add(gender.getText());
        formValues.add(reading.getText());
        return formValues;
    }

    public void fillfirstName(String firstnamevalue) {
        firstname.sendKeys(firstnamevalue);
    }

    public void fillLastName(String lastnamevalue) {
        lastname.sendKeys(lastnamevalue);
    }

    public void fillemail(String emailadress) {
        email.sendKeys(emailadress);
    }

    public void fillgender() {
        gender.click();
    }

    public void fillmobile(String mobilevalue) {
        mobile.sendKeys(mobilevalue);
    }

    public void fillsubjects(String subjectsvalue) {
        elementMethods.fillElement(subjects,subjectsvalue, Keys.ENTER );
        subjects.sendKeys(subjectsvalue);
        subjects.sendKeys(Keys.ENTER);
    }

    public void fillreading() {
        reading.click();
    }

    public void fillfile (){
        WebElement choosefile = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/Eu color.jpg");
        choosefile.sendKeys(file.getAbsolutePath());
    }

    public void filladress(String adressvalue) {
        adress.sendKeys(adressvalue);
    }

    public void fillstate(String statevalue) {
        elementMethods.scrollByPixel();
        elementMethods.clickElement((state));
        elementMethods.fillElement(selectstate, statevalue, Keys.ENTER);

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,350)");
//        state.click();
//        selectstate.sendKeys(statevalue);
//        selectstate.sendKeys(Keys.ENTER);
    }

    public void fillcity(String cityvalue) {
        city.click();
        selectcity.sendKeys(cityvalue);
        selectcity.sendKeys(Keys.ENTER);
    }

    public void fillsubmit() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", submitbutton);
    }

    public void clickclose() {
        closebutton.sendKeys(Keys.ENTER);

    }


    public void validatePracticeForm(String expectedmessage, String firstnamevalue, String lastnamevalue, String emailadress,
                                     String gendervalue, String mobilevalue, String subjectsvalue, String readingvalue,
                                     String adressvalue, String statevalue, String cityvalue) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy"); // poate fi si Locale.ENGLISH pentru luna intreaga
        LocalDateTime now = LocalDateTime.now();
        String dateofbirthvalue = dtf.format(now);


        WebElement thanksmessage = driver.findElement(By.id("example-modal-sizes-title-lg"));

        String actualmessage = thanksmessage.getText();

        Assert.assertEquals(actualmessage, expectedmessage);

        Assert.assertTrue(validationtable.get(0).getText().contains("Student Name"));
        Assert.assertTrue(validationtable.get(0).getText().contains(firstnamevalue + " " + lastnamevalue));

        Assert.assertTrue(validationtable.get(1).getText().contains("Student Email"));
        Assert.assertTrue(validationtable.get(1).getText().contains(emailadress));

        Assert.assertTrue(validationtable.get(2).getText().contains("Gender"));
        Assert.assertTrue(validationtable.get(2).getText().contains(gendervalue));

        Assert.assertTrue(validationtable.get(3).getText().contains("Mobile"));
        Assert.assertTrue(validationtable.get(3).getText().contains(mobilevalue));

        Assert.assertTrue(validationtable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue(validationtable.get(4).getText().contains(dateofbirthvalue));

        Assert.assertTrue(validationtable.get(5).getText().contains("Subjects"));
        Assert.assertTrue(validationtable.get(5).getText().contains(subjectsvalue));

        Assert.assertTrue(validationtable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(validationtable.get(6).getText().contains(readingvalue));

//        Assert.assertTrue(validationtable.get(7).getText().contains("Picture"));
//        Assert.assertTrue(validationtable.get(7).getText().contains(file.getName()));

        Assert.assertTrue(validationtable.get(8).getText().contains("Address"));
        Assert.assertTrue(validationtable.get(8).getText().contains(adressvalue));

        Assert.assertTrue(validationtable.get(9).getText().contains("State and City"));
        Assert.assertTrue(validationtable.get(9).getText().contains(statevalue + " " + cityvalue));

    }


}
















