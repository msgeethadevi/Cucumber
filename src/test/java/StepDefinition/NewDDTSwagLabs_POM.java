//package StepDefinition;
//
//import Pages.LoginPage_Swaglabs;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class NewDDTSwagLabs_POM {
//
//    WebDriver driver=null;
//
//    LoginPage_Swaglabs login; // LoginPage_Swaglabs object to access methods
//
//    @Given("Browser is launching")
//    public void browser_is_launching() throws InterruptedException {
//        System.out.println("inside NewDDTSwagLabs_POM");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\geeth\\IdeaProjects\\Cucumber\\src\\driver\\newchromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        System.out.println("Browser is launching");
//    }
//
//    @And("User is in swaglabs login page")
//    public void user_is_in_swaglabs_login_page() throws InterruptedException {
//        System.out.println("User is in swaglabs login page");
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
//    }
//
//    @When("^username entered(.*)$")
//    public void username_entered(String username) throws InterruptedException {
//        //driver.findElement(By.id("user-name")).sendKeys(username);
//        login=new LoginPage_Swaglabs(driver);
//        login.enterUsername(username);
//        Thread.sleep(2000);
//
//    }
//
//    @And("^taken(.*)$")
//    public void taken(String password) throws InterruptedException {
//        System.out.println("enters password");
//        //driver.findElement(By.id("password")).sendKeys(password);
//        login.enterPassword(password);
//        Thread.sleep(2000);
//    }
//
//    @Then("User is navigated to the swaglabs homepage")
//    public void user_is_navigated_to_the_swaglabs_homepage() throws InterruptedException {
//        System.out.println("User is navigated to the swaglabs homepage");
//
//        //driver.findElement(By.id("login-button")).click();
//        //Thread.sleep(2000);
//        try {
//            login.clickLogin();
//            Thread.sleep(2000);
//            Boolean logintest = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
//            if (logintest) {
//                System.out.println("login successful");
//            } else {
//                System.out.println("login unsuccessful");
//            }
//            Thread.sleep(2000);
//        }
//        catch(NoSuchElementException e){
//            System.out.println("login unsuccessful");
//        }
//        finally{
//            driver.quit();
//        }
//
//
//    }
//
//
//}
