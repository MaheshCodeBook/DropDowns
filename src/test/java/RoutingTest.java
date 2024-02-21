import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoutingTest {
    public  static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaroutingtest.ccbp.tech/");

        WebElement about = driver.findElement(By.linkText("About"));
        about.click();

        String expectedURL = "https://qaroutingtest.ccbp.tech/about";
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals(expectedURL)){
            System.out.println("Navigated to About page");
        }

        WebElement contact = driver.findElement(By.partialLinkText("Contact"));
        contact.click();

        String expectedURL1 = "https://qaroutingtest.ccbp.tech/contact";
        String currentURL1 = driver.getCurrentUrl();
        if (currentURL1.equals(expectedURL1)){
            System.out.println("Navigated to Contact page");
        }
        driver.quit();
    }
}
