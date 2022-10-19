package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_orange {
    WebDriver driver;

    By or_user_name=By.xpath("//input[@name='username']");
    By or_password = By.name("password");
    By or_btn_login = By.xpath("//button[@type='submit']");

    //creating a constructor to use this webdriver instance & passing a driver instance from POM page

    public LoginPage_orange(WebDriver driver) {
        this.driver=driver;

    }

    public void enterUsernameOrange(String user_name){

        driver.findElement(or_user_name).sendKeys(user_name);
    }

    public void enterPasswordOrange(String password){

        driver.findElement(or_password).sendKeys(password);
    }

    public void clickLoginOrange(){

        driver.findElement(or_btn_login).click();
    }

}

