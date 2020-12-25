package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageNavigation {
    private WebDriver driver;

By nextButton = By.xpath("//span[text()='Dalej']/../..");
By previousButton = By.xpath("//span[text()='Powrót']/../..");

    public PageNavigation(WebDriver driver) {
        this.driver = driver;
    }

    public void nextPageButtonClick(){
        driver.findElement(nextButton).click();
    }

    public void previousPageButtonClick(){
        driver.findElement(previousButton).click();

    }



}
