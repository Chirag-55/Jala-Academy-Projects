import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExamples {
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

        // Navigate to the dropdown page
        driver.findElement(By.linkText("Dropdown")).click();

        // Locate the dropdown element
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        // Example Dropdown interactions:

        // 1. Print all the options available in the dropdown
        Select selectDropdown = new Select(dropdown);
        System.out.println("Options in the Dropdown:");

        for (WebElement option : selectDropdown.getOptions()) {
            System.out.println(option.getText());
        }

        // 2. Print the first selected option from a dropdown
        WebElement firstSelectedOption = selectDropdown.getFirstSelectedOption();
        System.out.println("First Selected Option: " + firstSelectedOption.getText());

        // 3. Select an option by value from a dropdown
        selectDropdown.selectByValue("optionValue");

        // 4. Select an option by visible text from a dropdown
        selectDropdown.selectByVisibleText("Option Text");

        // 5. Select an option by index from a dropdown
        selectDropdown.selectByIndex(2);

        // Close the browser
        driver.quit();
    }
}
