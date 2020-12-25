package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillsPage {
    private WebDriver driver;


    By addReadyMadeSkillsButton = By.xpath("//span[text()='+ Dodaj gotowe umiejętności']");
    By teamworkSkillButton = By.xpath("//p[text()='Umiejętność pracy w zespole']");
    String teamworkSkillLevel = ("//input[@value='Umiejętność pracy w zespole']/../following-sibling::div//div//span[%s]");
    By computerSkillsButton = By.xpath("//p[text()='Obsługa komputera']");
    String computerSkillsLevel = ("//input[@value='Obsługa komputera']/../following-sibling::div//div//span[%s]");
    By creativityButton = By.xpath("//p[text()='Kreatywność']");
    String creativityLevel = ("//input[@value='Kreatywność']/../following-sibling::div//div//span[%s]");



    public SkillsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addReadyMadeSkillsButtonClick(){
        driver.findElement(addReadyMadeSkillsButton).click();
    }

    public void teamworkSkillButtonClickAndSetItsLevel(String level){
        driver.findElement(teamworkSkillButton).click();
        teamworkSkillLevel = teamworkSkillLevel.replace("%s", level);
        driver.findElement(By.xpath(teamworkSkillLevel)).click();
    }

    public void computerSkillsButtonClickAndSetItsLevel(String level){
        driver.findElement(computerSkillsButton).click();
        computerSkillsLevel = computerSkillsLevel.replace("%s",level);
        driver.findElement(By.xpath(computerSkillsLevel)).click();
    }

    public void creativityButtonClickAndSetItsLevel(String level){
        driver.findElement(creativityButton).click();
        creativityLevel = creativityLevel.replace("%s", level);
        driver.findElement(By.xpath(creativityLevel)).click();
    }



}
