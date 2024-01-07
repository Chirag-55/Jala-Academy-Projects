import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathExamples {
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

        // Example XPath expressions:

        // 1. Read label text and its color
        WebElement labelElement = driver.findElement(By.xpath("//label[@for='username']"));
        String labelText = labelElement.getText();
        String labelColor = labelElement.getCssValue("color");
        System.out.println("Label Text: " + labelText);
        System.out.println("Label Color: " + labelColor);

        // 2. Write an XPath for id, name, className
        WebElement elementById = driver.findElement(By.xpath("//*[@id='exampleId']"));
        WebElement elementByName = driver.findElement(By.xpath("//*[@name='exampleName']"));
        WebElement elementByClassName = driver.findElement(By.xpath("//*[@class='exampleClassName']"));

        // 3. How to find an element that contains specific text using contains()
        WebElement containsTextElement = driver.findElement(By.xpath("//*[contains(text(), 'Partial Text')]"));

        // 4. How to find an element using text()
        WebElement elementWithText = driver.findElement(By.xpath("//button[text()='Click Me']"));

        // 5. How to find an element that starts-with()
        WebElement startsWithElement = driver.findElement(By.xpath("//*[starts-with(@id, 'start')]"));

        // 6. XPath to select following-sibling and preceding
        WebElement followingSiblingElement = driver.findElement(By.xpath("//*[@id='currentElement']/following-sibling::div"));
        WebElement precedingElement = driver.findElement(By.xpath("//*[@id='currentElement']/preceding::div"));

        // 7. XPath to select an element using ancestor, child, parent, and descendant
        WebElement ancestorElement = driver.findElement(By.xpath("//*[@id='currentElement']/ancestor::div"));
        WebElement childElement = driver.findElement(By.xpath("//*[@id='currentElement']/child::div"));
        WebElement parentElement = driver.findElement(By.xpath("//*[@id='currentElement']/parent::div"));
        WebElement descendantElement = driver.findElement(By.xpath("//*[@id='currentElement']/descendant::div"));

        // 8. XPath using OR and AND
        WebElement orElement = driver.findElement(By.xpath("//button[@id='button1' or @id='button2']"));
        WebElement andElement = driver.findElement(By.xpath("//input[@type='text' and @name='username']"));

        // Close the browser
        driver.quit();
    }
}
