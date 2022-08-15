package Pages;

import Utils.CommonMethodss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends CommonMethodss {
    //go to select-------(Page8)
    //perform actions on all dropdowns
    @FindBy(xpath = "//a[text()='Select']")
    public WebElement selectPageBu;
    @FindBy (id = "countriesSingle")
    public WebElement ddSingleCountriesButton;
    @FindBy(id = "countriesMultiple")
    public WebElement multipleCountriesDD;
    @FindBy(xpath = "//button[@data-toggle='dropdown']")
    public WebElement countriesButton;
    @FindBy (xpath = "//a[text()='United States of America']")
    public WebElement countriesChoice;

    public SelectPage (){
        PageFactory.initElements(driver, this);
    }

}
