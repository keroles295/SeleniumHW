package testPages;

import Pages.WidgetsPage;
import Utils.CommonMethodss;
import org.testng.annotations.Test;

public class WidgetsPageTest extends CommonMethodss {


    @Test
    public void pag5Widgets(){
        WidgetsPage page5=new WidgetsPage();
        page5.widgetsBt.click();
        page5.chooseFile.sendKeys("C:\\Users\\Owner\\Pictures\\Screenshots//HW8.png");
        page5.uploadBt.click();
        page5.screenShotts("widgets");
        

    }






}
