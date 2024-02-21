import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoAppTest {
    public  static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatodos.ccbp.tech/");

        WebElement task = driver.findElement(By.className("todo-user-input"));
        task.sendKeys("Mahesh Vadlakonda");

        WebElement addButton = driver.findElement(By.id("addTodoButton"));
        addButton.click();

        WebElement task1 = driver.findElement(By.className("todo-user-input"));
        task1.sendKeys("Swathi Vadlakonda");

        WebElement addButton1 = driver.findElement(By.id("addTodoButton"));
        addButton1.click();

        WebElement task2 = driver.findElement(By.className("todo-user-input"));
        task2.sendKeys("Mokshith Vadlakonda");

        WebElement addButton2 = driver.findElement(By.id("addTodoButton"));
        addButton2.click();

        WebElement chechBox = driver.findElement(By.id("checkbox1"));
        chechBox.click();

        WebElement chechBox1 = driver.findElement(By.id("checkbox3"));
        chechBox1.click();

        driver.quit();

    }
}
