package testPages;

import Pages.FormPage;
import Utils.CommonMethodss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.*;

public class FormPageTest extends CommonMethodss {
    @Test
    public void formpageTest() throws InterruptedException {
        FormPage page4=new FormPage();

        page4.formPage.click();
        sendKeys(page4.firstName,"Pietro");

        sendKeys(page4.lastName, "Botros");
        page4.martialStatus.click();
        page4.hobbyCheckBox.click();

        Select select=new Select(page4.countryDD);
        List<WebElement>contriesDD=select.getOptions();
        select.selectByVisibleText("Egypt");


        page4.dateOfBirth.click();
        select=new Select(page4.monthDD);
        List<WebElement>monthDd=select.getOptions();
        select.selectByVisibleText("Oct");


         select=new Select(page4.yearDD);
        List<WebElement>yearDY=select.getOptions();
        select.selectByValue("2018");

        page4.listOfDays("22");
        Thread.sleep(3000);
        sendKeys(page4.phNum, "5408777989");
        sendKeys(page4.userName, "pitobotros");
        sendKeys(page4.emailIs, "pitofks236@gmail.com");
        sendKeys(page4.aboutYourSelf, " I am an architecture engineer ");
        Thread.sleep(3000);
        sendKeys(page4.passwordIs, "Piuo79975+++");
        screenShotts("formPage");
        page4.subBtn.click();


































































    }
}
