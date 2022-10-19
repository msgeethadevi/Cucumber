//package StepDefinition;
//
//import PageFactory.LoginPage_PF;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class SwagLabsTest_PF {
//    WebDriver driver=null;
//
//    LoginPage_PF login;
//
//    @Given("Browser is launching")
//    public void browser_is_launching() throws InterruptedException {
//        System.out.println("Page Factory");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\geeth\\IdeaProjects\\Cucumber\\src\\driver\\newchromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        System.out.println("Browser is launching");
//    }
//
//    @And("User is in swaglabs login page")
//    public void user_is_in_swaglabs_login_page() throws InterruptedException {
//               System.out.println("User is in swaglabs login page");
//        driver.navigate().to("https://www.saucedemo.com/");
//     Thread.sleep(2000);
//    }
//
//    @When("^username entered(.*)$")
//    public void username_entered(String username) throws InterruptedException {
//        login=new LoginPage_PF(driver);
//        System.out.println("User enters the user name");
//        login.enterUsername(username);
//        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        Thread.sleep(2000);
//
//    }
//
//    @And("^taken(.*)$")
//    public void taken(String password) throws InterruptedException {
//        System.out.println("enters password");
//        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        login.enterpassword(password);
//        Thread.sleep(2000);
//    }
//
//    @Then("User is navigated to the swaglabs homepage")
//    public void user_is_navigated_to_the_swaglabs_homepage() throws InterruptedException {
//        System.out.println("User is navigated to the swaglabs homepage");
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(2000);
//        try {
//            Boolean logintest = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
//            Thread.sleep(2000);
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
