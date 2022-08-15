package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonMethodss {

    public static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        String url = "http://www.uitestpractice.com/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
//    closBrowser


    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }

    //sendKeys
    public void sendKeys(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public void waitforvisibilityOfAllElement(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }






    public void screenShotts(String tsName)  {
        TakesScreenshot st=(TakesScreenshot) driver;
        File stFile=st.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(stFile, new File("screenShots/HW1/"+tsName+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
