package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethodss {
    //click on home-------(Page2)
    //delete one user from the table

    //go to the next link-------(Page2)
    //click on the ajax link and wait for the text-------(Page3)
    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeBtn;
    @FindBy(xpath = "//button[text()='DELETE']")
    public WebElement deletBtn;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement confDelBt;

    @FindBy(xpath = "//a[@rel='next']")
    public WebElement nextBu;

    @FindBy(xpath = "//a[text()='AjaxCall']")
    public WebElement ajaxCallBu;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }




}
