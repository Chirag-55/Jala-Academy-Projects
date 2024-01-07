import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExamples {
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

        // Example Link interactions:

        // 1. Clicking a link using partialLinkText
        WebElement partialLink = driver.findElement(By.partialLinkText("Partial Link Text"));
        partialLink.click();

        // 2. Clicking a link using link Text
        WebElement linkTextLink = driver.findElement(By.linkText("Exact Link Text"));
        linkTextLink.click();

        // 3. Find out all the links in a web page
        System.out.println("All Links on the Page:");

        for (WebElement link : driver.findElements(By.tagName("a"))) {
            System.out.println(link.getText());
        }

        // 4. Clicking on an image link
        WebElement imageLink = driver.findElement(By.xpath("//a[contains(@href,'image')]"));
        imageLink.click();

        // Close the browser
        driver.quit();
    }
}
