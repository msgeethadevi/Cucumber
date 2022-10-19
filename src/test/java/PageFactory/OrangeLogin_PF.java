package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogin_PF {
    WebDriver driver;

    @FindBy(name="username")
    WebElement or_user_name;

    @FindBy(name="password")
    WebElement or_password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement or_btn_login;


    public OrangeLogin_PF(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){

        or_user_name.sendKeys(username);
    }

    public void enterpassword(String password) {

        or_password.sendKeys(password);
    }

    public void LoginButton(){
         or_btn_login.click();}
}
