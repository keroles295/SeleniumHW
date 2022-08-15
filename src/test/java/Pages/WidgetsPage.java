package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetsPage extends CommonMethodss {

    //go to widgets-------(Page5)
    //upload any file and verify it is uploaded
    @FindBy(xpath = "//a[text()='Widgets']")
    public WebElement widgetsBt;

    @FindBy(id ="image_file" )
    public WebElement chooseFile;

    @FindBy (xpath = "//input[@value='Upload']")
    public WebElement uploadBt;




    @FindBy (xpath = "//div[@class='ContactUs']")
    public WebElement uploadSucces;

    public WidgetsPage(){
        PageFactory.initElements(driver, this);
    }





}
