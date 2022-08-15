package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlPage extends CommonMethodss {
    //TC:4 --> do on selenium project by using POM-------(Page1)
    //Go to http://www.uitestpractice.com/
    //interact with drag and drop, iframe, double click

    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement drag;



    @FindBy(xpath = "//div[@id='droppable']")
    public WebElement drop;

    @FindBy(xpath = "//iframe[@name='iframe_a']")
    public WebElement iframeWeb;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement textBoxIF;

    @FindBy(xpath = "//button[@name='dblClick']")
    public WebElement doubleBt;

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeBtn;


    public ControlPage(){
        PageFactory.initElements(driver,this);

    }





}
