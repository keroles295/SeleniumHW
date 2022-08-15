package testPages;

import Pages.AjaxPage;
import Utils.CommonMethodss;
import org.testng.annotations.Test;

public class AjaxPageTest extends CommonMethodss {
    @Test
    public void testAjaxPage(){
        AjaxPage page3=new AjaxPage();
        page3.ajaxCallBu.click();
        page3.ahaxLink.click();
        page3.waitAjax();
        page3.textOfAjaxBox.isDisplayed();
        screenShotts("ajaxe");

    }
}
