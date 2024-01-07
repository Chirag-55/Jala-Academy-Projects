import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxActionsExample {
    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the webpage containing the text box
        driver.get("http://magnus.jalatechnologies.com/");

        // Locate the text box by its ID
        WebElement textBox = driver.findElement(By.id("textboxId"));

        // 1. Type in a Text Box using Selenium WebDriver
        textBox.sendKeys("Hello, Selenium!");

        // 2. Get a Text Box value using Selenium WebDriver
        String textBoxValue = textBox.getAttribute("value");
        System.out.println("Text Box Value: " + textBoxValue);

        // 3. Read the placeholder value of a Text Box using getAttribute() method
        String placeholderValue = textBox.getAttribute("placeholder");
        System.out.println("Placeholder Value: " + placeholderValue);

        // 4. Deleting/clear text from the Text Box
        textBox.clear();

        // 5. Check if Text Box is enabled/disabled
        boolean isTextBoxEnabled = textBox.isEnabled();
        System.out.println("Is Text Box Enabled: " + isTextBoxEnabled);

        // Close the browser
        driver.quit();
    }
}
