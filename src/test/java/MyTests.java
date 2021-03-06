import helpers.CommonUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyTests {

    private WebDriver driver;
    private PersonalDataPage personalDataPage;
    private MainPage mainPage;
    private PageNavigation pageNavigation;
    private PreviewPage previewPage;
    private ExperiancePage experiancePage;
    private EducationPage educationPage;
    private SkillsPage skillsPage;
    private CommonUtils commonUtils;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("https://app.interviewme.pl/template/concept");
        driver.get("https://interviewme.pl/");
        mainPage = new MainPage(driver);//przekazanie drivera
        personalDataPage = new PersonalDataPage(driver);
        pageNavigation = new PageNavigation(driver);
        previewPage = new PreviewPage(driver);
        experiancePage = new ExperiancePage(driver);
        educationPage = new EducationPage(driver);
        skillsPage = new SkillsPage(driver);
        commonUtils = new CommonUtils(driver);



    }

    @Test
    public void personalDataPageTest()throws IOException{
        mainPage.createCV();
        personalDataPage.setName("Ewelina");
        personalDataPage.setLastname("Durko");
        personalDataPage.attachPhoto("C:\\Users\\Dom\\Desktop\\SeleniumTesting\\src\\main\\resources\\Untitled.png");
        personalDataPage.setTelephoneNumber("600648882");
        personalDataPage.setAddressField("ul. Pocieszka 15/2\n32-087 Kraków");
        Assert.assertTrue(personalDataPage.isNameInputDisplayed());
        Assert.assertTrue(personalDataPage.isSecondNameInputDisplayed());
        Assert.assertTrue(personalDataPage.isNameSet("Ewelina"));
        Assert.assertTrue(personalDataPage.isSecondNameSet("Durko"));
        Assert.assertTrue(previewPage.isNameVisible("Ewelina"));
        commonUtils.takeScreenShot(driver);

    }

    @Test
    public void e2eTest() throws IOException {
        mainPage.createCV();
        personalDataPage.setName("Ewelina");
        personalDataPage.setLastname("Durko");
        personalDataPage.attachPhoto("C:\\Users\\Dom\\Desktop\\SeleniumTesting\\src\\main\\resources\\Untitled.png");
        personalDataPage.setEmailAddress("ewelinatrzaska@interia.pl");
        personalDataPage.setTelephoneNumber("600648882");
        personalDataPage.setAddressField("ul. Pocieszka 15/2\n32-087 Kraków");


        pageNavigation.nextPageButtonClick();

        educationPage.setSchoolName("Uniwersytet Rolniczy");
        educationPage.setSchoolLocationName("Kraków");
        educationPage.setAcademicDegree("Studia magisterskie");
        educationPage.setFieldOfStudy("Inżynieria Wodna i Sanitarna");
        educationPage.setStartOfStudyYear("2006");
        educationPage.setStartOfStudyMonth("Październik");


        pageNavigation.nextPageButtonClick();
        experiancePage.skipButtonClick();

        experiancePage.setCorporationName("Adservco Group");
        experiancePage.setCityLocation("Kraków");
        experiancePage.setPosition("Project Engeneer");
        experiancePage.setStartYearSelector("2012");
        experiancePage.setStartMonthSelector("Sierpień");

        //educationPage.skipButtonClick();
        pageNavigation.nextPageButtonClick();


        skillsPage.addReadyMadeSkillsButtonClick();
        skillsPage.teamworkSkillButtonClickAndSetItsLevel("2");
        skillsPage.computerSkillsButtonClickAndSetItsLevel("3");
        skillsPage.creativityButtonClickAndSetItsLevel("3");

    }
    @After
    public void tearDown() {
        driver.close();
    }





}
