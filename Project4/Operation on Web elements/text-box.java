import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxExamples {
    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the Magnus application site
        driver.get("http://magnus.jalatechnologies.com/");

        // Perform login
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginBtn"));

        usernameField.sendKeys("training@jalaacademy.com");
        passwordField.sendKeys("jobprogram");
        loginButton.click();

        // Navigate to the text box page
        driver.findElement(By.linkText("Text Box")).click();

        // Example Text Box interactions:

        // 1. How to Type in text box using Selenium Web Driver
        WebElement textBox = driver.findElement(By.id("myTextBox"));
        textBox.sendKeys("This is a sample text");

        // 2. How to get a Text Box value using Selenium Web Driver
        String textBoxValue = textBox.getAttribute("value");
        System.out.println("Text Box Value: " + textBoxValue);

        // 3. How to read the placeholder value of a Text Box using getAttribute() method
        String placeholderValue = textBox.getAttribute("placeholder");
        System.out.println("Text Box Placeholder Value: " + placeholderValue);

        // 4. Deleting/clear text from the Text Box
        textBox.clear();

        // 5. Check if Text Box is enabled/disabled
        boolean isTextBoxEnabled = textBox.isEnabled();
        System.out.println("Is Text Box Enabled? " + isTextBoxEnabled);

        // Close the browser
        driver.quit();
    }
}
