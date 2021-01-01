package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PersonalDataPage {

    private WebDriver driver;
    By nameField = By.xpath("//input[@name='firstName']");
    By secondNameField = By.xpath("//input[@name='lastName']");
    By attachPhotoButton = By.xpath("//input[@type='file']");
    By savePhoto = By.xpath("//*[text()='Zapisz']");
    By emailField = By.xpath("//input[@placeholder='twoj.email@przyklad.pl']");
    By telephoneField = By.xpath("//input[@placeholder='+48 770 001 015']");
    By addressField = By.xpath("//textarea[@name='address']");



    public PersonalDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setLastname(String lastname){
        driver.findElement(secondNameField).sendKeys(lastname);
    }

    public void attachPhoto(String path){
        driver.findElement(attachPhotoButton).sendKeys(path);
        driver.findElement(savePhoto).click();
    }

    public void setEmailAddress(String emailAddress){
        driver.findElement(emailField).sendKeys(emailAddress);
    }

    public void setTelephoneNumber(String telephoneNumber){
        driver.findElement(telephoneField).sendKeys(telephoneNumber);
    }

    public void setAddressField(String address){
        driver.findElement(addressField).sendKeys(address);

    }

    //MethodForAssertions

    public boolean isNameInputDisplayed(){
        if(driver.findElement(nameField).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }

    public boolean isSecondNameInputDisplayed(){
        if(driver.findElement(secondNameField).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }


    public boolean isNameSet(String name){
      String valueSet =  driver.findElement(nameField).getAttribute("value");
      if(valueSet.equals(name)){
          return true;
      }else{
          return false;
      }
    }

    public boolean isSecondNameSet(String secondName){
        String valueSet =  driver.findElement(secondNameField).getAttribute("value");
        if(valueSet.equals(secondName)){
            return true;
        }else{
            return false;
        }
    }



    public boolean isEmailAdressContainsAtSign(){
        String emailSet = driver.findElement(emailField).getAttribute("value");
        if(emailSet.contains("@")){
            return true;
        }else {
            return false;
        }

    }
}
