import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MeetupRegisterTest {
    public  static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");

        WebElement register = driver.findElement(By.id("registerButton"));
        register.click();

        String expectedURL = "https://qameetup.ccbp.tech/register";
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.equals(expectedURL)){
            System.out.println("Navigated to Register page");
        }

        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Mahesh Vadlkonda");

        WebElement topics = driver.findElement(By.id("topic"));

        Select selectTopic = new Select(topics);
        selectTopic.selectByVisibleText("Games");

        WebElement registerButton = driver.findElement(By.tagName("button"));
        registerButton.click();

        String expectedURL1 = "https://qameetup.ccbp.tech/";
        String currentUrl1 = driver.getCurrentUrl();
        if (currentUrl1.equals(expectedURL1)){
            System.out.println("Navigated to Home page");
        }

        driver.get("https://qameetup.ccbp.tech/random-text");

        String expectedURL2 = "https://qameetup.ccbp.tech/";
        String currentUrl2 = driver.getCurrentUrl();
        if (currentUrl2.equals(expectedURL2)){
            System.out.println("Navigated to Not Found page");
        }
        driver.quit();
    }
}
