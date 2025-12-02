import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basictest {
    public static void main(String[] args) {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open login page
        driver.get("https://the-internet.herokuapp.com/login");

        // Username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("nada");
        username.clear();
        username.sendKeys("tomsmith");

        // Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123");
        password.clear();
        password.sendKeys("SuperSecretPassword!");

        // Click Login
        WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));
        loginBtn.click();

        // Click Logout
        WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
        logoutBtn.click();

        // Print Message
        WebElement msg = driver.findElement(By.id("flash"));
        System.out.println("Message: " + msg.getText());

        // Close browser
        driver.quit();
    }
}

