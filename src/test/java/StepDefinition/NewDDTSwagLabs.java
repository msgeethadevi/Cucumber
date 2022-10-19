//package StepDefinition;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class NewDDTSwagLabs {
//
//    WebDriver driver=null;
//
//    @Given("Browser is launching")
//    public void browser_is_launching() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\geeth\\IdeaProjects\\Cucumber\\src\\driver\\newchromedriver.exe");
//        driver = new ChromeDriver();
//        //driver.manage().window().maximize();
//        //driver.manage().window().setSize();
//        driver.manage().deleteAllCookies();
//        System.out.println("Browser is launching using DDT");
//    }
//
//    @And("User is in swaglabs login page")
//    public void user_is_in_swaglabs_login_page() throws InterruptedException {
//        System.out.println("User is in swaglabs login page using DDT");
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
//    }
//
//    @When("^username entered(.*)$")
//    public void username_entered(String username) throws InterruptedException {
//        System.out.println(username);
//        driver.findElement(By.id("user-name")).sendKeys(username);
//        Thread.sleep(2000);
//
//        System.out.println("user name entered using DDT");
//
//    }
//
//    @And("^taken(.*)$")
//    public void taken(String password) throws InterruptedException {
//        System.out.println("enters password using DDT"+password);
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//
//        Thread.sleep(2000);
//    }
//
//    @Then("User is navigated to the swaglabs homepage")
//    public void user_is_navigated_to_the_swaglabs_homepage() throws InterruptedException {
//        System.out.println("User is navigated to the swaglabs homepage using DDT");
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
//            driver.quit();
//            System.out.println("Completed using DDT");
//        }
//
//
//    }
//
//
//}
