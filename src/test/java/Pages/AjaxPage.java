package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxPage extends CommonMethodss {
    //click on the ajax link and wait for the text-------(Page3)
    //verify that the text is displayed
    @FindBy(xpath = "//a[text()='AjaxCall']")
    public WebElement ajaxCallBu;

    @FindBy(xpath = "//a[text()='This is a Ajax link']")
    public WebElement ahaxLink;

    public void waitAjax(){
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='ContactUs']")));
    }

    @FindBy(xpath = "//div[@class='ContactUs']")
    public WebElement textOfAjaxBox;


    public AjaxPage(){
        PageFactory.initElements(driver,this);
    }





}
