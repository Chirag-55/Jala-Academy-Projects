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

        // Open the webpage for XPath examples
        driver.get("http://magnus.jalatechnologies.com/");

        // 1. Read label text and its color
        readLabelTextAndColor(driver);

        // 2. Write an XPath for id, name, className
        WebElement elementById = driver.findElement(By.xpath("//*[@id='elementId']"));
        WebElement elementByName = driver.findElement(By.xpath("//*[@name='elementName']"));
        WebElement elementByClassName = driver.findElement(By.xpath("//*[@class='elementClassName']"));

        // 3. How to find an element that contains specific text using contains()
        WebElement elementWithText = driver.findElement(By.xpath("//*[contains(text(), 'Partial Text')]"));

        // 4. How to find an element using text()
        WebElement elementWithExactText = driver.findElement(By.xpath("//*[text()='Exact Text']"));

        // 5. How to find an element that starts-with()
        WebElement elementStartsWith = driver.findElement(By.xpath("//*[starts-with(@id, 'start')]"));

        // 6. XPath to select following-sibling and preceding
        WebElement followingSibling = driver.findElement(By.xpath("//*[@id='currentElement']/following-sibling::div"));
        WebElement precedingElement = driver.findElement(By.xpath("//*[@id='currentElement']/preceding::div"));

        // 7. XPath to select an element using ancestor, child, parent, and descendant
        WebElement ancestorElement = driver.findElement(By.xpath("//*[@id='currentElement']/ancestor::div"));
        WebElement childElement = driver.findElement(By.xpath("//*[@id='currentElement']/child::span"));
        WebElement parentElement = driver.findElement(By.xpath("//*[@id='currentElement']/parent::div"));
        WebElement descendantElement = driver.findElement(By.xpath("//*[@id='currentElement']/descendant::span"));

        // 8. XPath using OR and AND
        WebElement elementWithOrCondition = driver.findElement(By.xpath("//*[@id='element1' or @id='element2']"));
        WebElement elementWithAndCondition = driver.findElement(By.xpath("//*[@id='element1' and @class='elementClass']"));

        // Close the browser
        driver.quit();
    }

    private static void readLabelTextAndColor(WebDriver driver) {
        // Read label text and its color
        WebElement labelElement = driver.findElement(By.xpath("//*[@id='labelId']"));
        String labelText = labelElement.getText();
        String labelColor = labelElement.getCssValue("color");

        System.out.println("Label Text: " + labelText);
        System.out.println("Label Color: " + labelColor);
    }
}
