package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormPage extends CommonMethodss {
    //go to Form-------(Page4)
    //and fill out everything
    @FindBy(xpath = "//a[text()='Form']")
    public WebElement formPage;

    @FindBy (id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy (xpath = "//input[@type='radio']")
    public WebElement martialStatus;

    @FindBy (xpath = "//input[@value='dance']")
    public WebElement hobbyCheckBox;

    @FindBy (xpath = "//select[@id='sel1']")
    public WebElement countryDD;

    @FindBy (xpath = "//input[@id='datepicker']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//select[@data-handler='selectMonth']")
    public WebElement monthDD;

    @FindBy(xpath = "//select[@data-handler='selectYear']")
    public WebElement yearDD;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public WebElement dayAllTableData;

    public void listOfDays(String text){
        List<WebElement>listday=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dayss : listday) {
            if(dayss.getText().equals(text)){
                dayss.click();
            }
        }
    }

    @FindBy(id = "phonenumber")
    public WebElement phNum;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "email")
    public WebElement emailIs;

    @FindBy(id = "comment")
    public WebElement aboutYourSelf;

    @FindBy(id = "pwd")
    public WebElement passwordIs;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement subBtn;

    public FormPage(){
        PageFactory.initElements(driver, this);
    }






















}
