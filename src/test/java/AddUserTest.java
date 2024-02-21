import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddUserTest {
    public  static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaadduser.ccbp.tech/");

        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Mahesh Vadlakonda");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("mahesh@abc.com");

        WebElement status = driver.findElement(By.id("status"));
        Select dropdown = new Select(status);
        dropdown.selectByValue("Active");

        WebElement female = driver.findElement(By.id("genderFemale"));
        female.click();

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        System.out.println("Add User Form Submitted");
        driver.quit();
    }
}
