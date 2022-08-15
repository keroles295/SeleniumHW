package testPages;

import Pages.ControlPage;
import Utils.CommonMethodss;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ControlPageTest extends CommonMethodss {

    //interact with drag and drop, iframe, double click
    @Test
    public void page1() throws InterruptedException {

        ControlPage page=new ControlPage();
        Actions actions=new Actions(driver);
        actions.clickAndHold(page.drag).moveToElement(page.drop).release().build().perform();
        driver.switchTo().frame(page.iframeWeb);
        sendKeys(page.textBoxIF, "I will never walk alone");
        System.out.println(page.textBoxIF.getText());
        driver.switchTo().defaultContent();
        actions.doubleClick(page.doubleBt).perform();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        screenShotts("cotrol");
        page.homeBtn.click();








    }
}
