package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EducationPage {
    private WebDriver driver;

By schoolNameField = By.xpath("//input[@placeholder='Uniwersytet Warszawski'][@type='text']");
By schoolLocationNameField = By.xpath("//input[@name='location.city']");
By academicDegreeField = By.xpath("//input[@name='degree']");
By fieldOfStudyField = By.xpath("//input[@name='fieldOfStudy']");
By startOfStudyYearSelect = By.xpath("//select[@name='year']");
String selectedYear = ("//select[@name='year']//option[text()='%s']");
By startOfStudyMonth = By.xpath("//select[@name='month']");
String selectedMonth = ("//select[@name='month']//option[text()='%s']");
By skipButton = By.xpath("//button[@type='button'][@data-cy='softwall-skip-auth']");


    public EducationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSchoolName(String schoolName){
        driver.findElement(schoolNameField).sendKeys(schoolName);
    }

    public void setSchoolLocationName(String schoolLocationName){
        driver.findElement(schoolLocationNameField).sendKeys(schoolLocationName);
    }

    public void setAcademicDegree(String academicDegree){
        driver.findElement(academicDegreeField).sendKeys(academicDegree);
    }

    public void setFieldOfStudy(String fieldOfStudy){
        driver.findElement(fieldOfStudyField).sendKeys(fieldOfStudy);
    }

    public void setStartOfStudyYear(String studyYear){
        driver.findElement(startOfStudyYearSelect).click();
        selectedYear = selectedYear.replace("%s",studyYear);
        driver.findElement(By.xpath(selectedYear)).click();

    }

    public void setStartOfStudyMonth(String studyMonth){
        driver.findElement(startOfStudyMonth);
        selectedMonth = selectedMonth.replace("%s",studyMonth);
        driver.findElement(By.xpath(selectedMonth)).click();

    }
    public void skipButtonClick(){
        driver.findElement(skipButton).click();
    }

}
