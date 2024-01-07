import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MagnusLoginAutomation {

    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the Magnus application login page
        driver.get("http://magnus.jalatechnologies.com/");

        // Scenario 1: Login with valid credentials
        login(driver, "training@jalaacademy.com", "jobprogram");

        // Scenario 2: Login with invalid username
        login(driver, "invaliduser@example.com", "password");

        // Scenario 3: Login with invalid password
        login(driver, "training@jalaacademy.com", "invalidpassword");

        // Scenario 4: Login with empty username and password
        login(driver, "", "");

        // Scenario 5: Login with spaces in username and password
        login(driver, "   training@jalaacademy.com   ", "   jobprogram   ");

        // Close the browser
        driver.quit();
    }

    private static void login(WebDriver driver, String username, String password) {
        // Locate username and password fields and login button using different locators
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));

        // Enter username and password
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        // Click the login button
        loginButton.click();

        // Add verification or assertion steps based on the application's behavior
        System.out.println("Login attempted with username: " + username + " and password: " + password);
    }
}
