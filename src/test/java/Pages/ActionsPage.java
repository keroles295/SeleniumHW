package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPage extends CommonMethodss {

    //go to actions and perform all the necessary actions-------(Page6)
    @FindBy (xpath = "//a[text()='Actions']")
    public WebElement actionsBtn;
    @FindBy(xpath = "//button[@name='click']")
    public WebElement clickMeButton;
    @FindBy(xpath = "//button[@name='dblClick']")
    public WebElement doubleClickBtn;
    @FindBy (id = "draggable")
    public WebElement dragBt;
    @FindBy (id = "droppable")
    public WebElement dropBt;
    @FindBy (id = "div2")
    public WebElement colorBox;


    public ActionsPage(){
        PageFactory.initElements(driver, this);
    }

}
