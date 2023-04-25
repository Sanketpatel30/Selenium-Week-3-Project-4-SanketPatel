package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {
    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
//This method will send text element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //this method will get Text from element
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

/******************************************Alert Method***************************************************/
//Homework

    /**
     * This method will switch to alert
     */
    public void switchToAlert() {
        driver.switchTo().alert().accept();
    }

    /**
     * This method will accept to alert
     */
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void getTextFromAlert(){
        driver.switchTo().alert().getText();
    }
    public void sendKeysToAlert(){
        driver.switchTo().alert().sendKeys("Sanket");
    }
}
