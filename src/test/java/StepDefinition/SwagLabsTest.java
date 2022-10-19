//package StepDefinition;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class SwagLabsTest {
//    WebDriver driver=null;
//
//    @Given("Browser is launching")
//    public void browser_is_launching() throws InterruptedException {
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
//     Thread.sleep(2000);
//    }
//
//    @When("username entered")
//    public void username_entered() throws InterruptedException {
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        Thread.sleep(2000);
//
//    }
//
//    @And("password taken")
//    public void password_taken() throws InterruptedException {
//        System.out.println("enters password");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        Thread.sleep(2000);
//    }
//
//    @Then("User is navigated to the swaglabs homepage")
//    public void user_is_navigated_to_the_swaglabs_homepage() throws InterruptedException {
//        System.out.println("User is navigated to the swaglabs homepage");
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(2000);
//        try {
//            boolean logintest = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
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
//            System.out.println("Noramal method ");
//        }
//
//
//    }
//
//
//}
