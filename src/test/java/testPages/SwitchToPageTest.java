package testPages;

import Pages.SwitchToPage;
import Utils.CommonMethodss;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class SwitchToPageTest extends CommonMethodss {
    @Test
    public void switchToPage() throws InterruptedException {
        SwitchToPage page=new SwitchToPage();
        page.switchPage.click();
        page.alartButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        page.cofirmButton.click();
        alert.dismiss();
        page.promptButton.click();
        alert.sendKeys("Keroles");
        alert.accept();
        driver.switchTo().frame("iframe_a");
        page.textBoxIframe.sendKeys("botros");
        driver.switchTo().defaultContent();
        page.launchModelButton.click();
        page.closeButton.click();
        screenShotts("switch");






    }
}
