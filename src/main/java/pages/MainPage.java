package pages;

import helpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;



    private By createCVButton = By.xpath("//a[@title='Stwórz CV Teraz']");
    private By createCVIn5Minutes = By.xpath("//a[@title='STWÓRZ CV W 5 MINUT']");
    private By experianceLevel = By.xpath("//img[@alt='junior']/..");
    private By saveAndContinueButton = By.xpath("//span[text()='Zapisz i przejdź dalej']");
    private By templateCVButton = By.xpath("//button[@data-cy = 'template-go-to-content'][@type='button']");
    private By startCreateCVButton = By.xpath("//span[text()='Rozpocznij']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createCV() {
        driver.findElement(createCVButton).click();
        driver.findElement(createCVIn5Minutes).click();
        WebElement startCreateCVButton = driver.findElement(By.xpath("//span[text()='Rozpocznij']"));
        WaitHelpers.waitForElementToBeVisible(startCreateCVButton,driver);
        startCreateCVButton.click();
        driver.findElement(experianceLevel).click();
        driver.findElement(saveAndContinueButton).click();
        driver.findElement(templateCVButton).click();

    }
}
