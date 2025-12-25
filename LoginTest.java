import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open application
        driver.get("https://example.com/login");
        driver.manage().window().maximize();

        // Locate elements
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("testpass");
        driver.findElement(By.id("loginBtn")).click();

        // Validation (simple check)
        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }

        driver.quit();
    }
}
