package testPages;

import Pages.SelectPage;
import Utils.CommonMethodss;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectPageTest extends CommonMethodss {
    @Test
    public void selectPageTest(){
        SelectPage page=new SelectPage();
        page.selectPageBu.click();
        Select select=new Select(page.ddSingleCountriesButton);
        select.selectByVisibleText("China");
        select=new Select(page.multipleCountriesDD);
        select.selectByValue("england");
        page.countriesButton.click();
        page.countriesChoice.click();
        screenShotts("select");





    }
}
