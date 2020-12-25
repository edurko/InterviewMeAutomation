package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreviewPage {
    private WebDriver driver;

   String locatorToName = ("//*[@data-cy='builder-preview-page-1']//*[contains(text(),'%s')]");


    public PreviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isNameVisible(String name){
        boolean namevisible;
        locatorToName = locatorToName.replace("%s",name);
        namevisible = driver.findElement(By.xpath(locatorToName)).isDisplayed();
        return  namevisible;
    }



}
