package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchToPage extends CommonMethodss {
    //go to SwitchTo-------(Page7)
    //work with alerts and frames
    @FindBy(xpath = "//a[text()='Switch to']")
    public WebElement switchPage;
    @FindBy(id = "alert")
    public WebElement alartButton;
    @FindBy(id = "confirm")
    public WebElement cofirmButton;
    @FindBy(id = "prompt")
    public WebElement promptButton;
    @FindBy(xpath = "//button[@data-target='#myModal']")
    public WebElement launchModelButton;
    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeButton;
    @FindBy(id = "basicAuthentication")
    public WebElement basicAuthenticationButton ;
    @FindBy(id = "name")
    public WebElement textBoxIframe;
    public SwitchToPage(){
        PageFactory.initElements(driver,this);
    }

}
