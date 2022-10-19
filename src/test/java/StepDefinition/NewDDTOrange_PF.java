//package StepDefinition;
//
//import PageFactory.OrangeLogin_PF;
//import Pages.LoginPage_orange;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class NewDDTOrange_PF {
//
//    WebDriver driver=null;
//
//    OrangeLogin_PF login;
//
//    @Given("browser launching")
//    public void browser_launching() {
//        System.out.println("Inside Page Factory");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\geeth\\IdeaProjects\\Cucumber\\src\\driver\\newchromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        System.out.println("Browser is launching");
//    }
//
//    @And("login page to be opened")
//    public void login_page_to_be_opened() throws InterruptedException {
//        System.out.println("User is in Orange login page");
//        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(2000);
//    }
//
//    @When("^username is entered(.*)$")
//    public void username_is_entered(String user_name) throws InterruptedException {
//        System.out.println("User enters the user name");
//        login= new OrangeLogin_PF(driver);
//        login.enterUsername(user_name);
//        //driver.findElement(By.name("username")).sendKeys(user_name);
//        Thread.sleep(2000);
//    }
//
//    @And("^password entered(.*)$")
//    public void password_entered(String password) throws InterruptedException {
//        System.out.println("enters password");
//        //driver.findElement(By.name("password")).sendKeys(password);
//        login.enterpassword(password);
//        Thread.sleep(2000);
//    }
//
//    @Then("orange home page to be opened")
//    public void orange_home_page_to_be_opened() throws InterruptedException {
//        System.out.println("User is navigated to the Orange homepage");
//        //driver.findElement(By.xpath("//button[@type='submit']")).click();
//        login.LoginButton();
//        Thread.sleep(4000);
//
//        try{
//            boolean text=driver.findElement(By.xpath("//img[@src='/web/images/orangehrm-logo.png?1660914792648']")).isDisplayed();
//            System.out.println("Login successful and the text is "+text);
//        }
//        catch (NoSuchElementException e){
//            System.out.println("Login Unsuccessful & Exception catched");
//        }
//        finally {
//            driver.quit();
//        };
//
//    }
//
//}
