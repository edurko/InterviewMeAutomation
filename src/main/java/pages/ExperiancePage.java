package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExperiancePage {
    private WebDriver driver;

By corporationNameField = By.xpath("//input[@placeholder='ABC Corporation Int.']");
By cityLocationField = By.xpath("//input[@name='location.city']");
By positionField = By.xpath("//input[@data-name='position']");
By startYearSelect = By.xpath("//select[@data-name='dateFrom']");
By exactPhrase = By.xpath("//div[text()='Dokładna fraza']/following-sibling::span");
String selectedYearValue = ("//select[@data-name='dateFrom']/option[text()='%s']");
By startMonthSelect = By.xpath("//select[@name='month']");
String startMonthValue = ("//select[@name='month']/option[text()='%s']");
By skipButton = By.xpath("//span[text()='Pomiń']");
By presentCheckbox = By.xpath("//input[@type='checkbox'][@name='present']");


    public ExperiancePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCorporationName(String corporationName){
        driver.findElement(corporationNameField).sendKeys(corporationName);
    }

    public void setCityLocation(String cityLocation){
        driver.findElement(cityLocationField).sendKeys(cityLocation);
    }

    public void setPosition(String position){
        driver.findElement(positionField).sendKeys(position);
        driver.findElement(exactPhrase).click();
    }

    public void setStartYearSelector(String year){
        driver.findElement(startYearSelect).click();
        selectedYearValue = selectedYearValue.replace("%s",year);
        driver.findElement(By.xpath(selectedYearValue)).click();
    }

    public void setStartMonthSelector(String month){
        driver.findElement(startMonthSelect).click();
        startMonthValue = startMonthValue.replace("%s",month);
        driver.findElement(By.xpath(startMonthValue)).click();
    }

    public void skipButtonClick(){
        driver.findElement(skipButton).click();
    }



}
