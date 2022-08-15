package testPages;

import Pages.ActionsPage;
import Utils.CommonMethodss;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPageTest extends CommonMethodss {
    @Test
    public void actionsPage() throws InterruptedException {
        ActionsPage page6=new ActionsPage();
        page6.actionsBtn.click();
        page6.clickMeButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Actions actions=new Actions(driver);
        actions.doubleClick(page6.doubleClickBtn).perform();
        //Thread.sleep(3000);
        alert.accept();
        actions.clickAndHold(page6.dragBt).moveToElement(page6.dropBt).release().perform();
        actions.moveToElement(page6.colorBox);
        screenShotts("actions");




    }
}
