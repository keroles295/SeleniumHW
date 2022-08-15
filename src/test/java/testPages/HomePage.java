package testPages;

import Utils.CommonMethodss;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePage extends CommonMethodss {
    @Test
    public void page2Test(){
        Pages.HomePage page2=new Pages.HomePage();
        page2.homeBtn.click();
        page2.deletBtn.click();
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type='submit']")));
        page2.confDelBt.click();
        page2.nextBu.click();
        page2.ajaxCallBu.click();
        screenShotts("home");
    }
}
