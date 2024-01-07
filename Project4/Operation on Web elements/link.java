import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class LinkActionsExample {
    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the webpage containing links
        driver.get("http://example.com");

        // 1. Clicking a link using partialLinkText
        clickLinkByPartialText(driver, "Partial Link");

        // 2. Clicking a link using linkText
        clickLinkByText(driver, "Full Link Text");

        // 3. Find out all the links in a web page
        findAllLinks(driver);

        // 4. Clicking on an image link
        clickImageLink(driver, "Image Link Alt Text");

        // Close the browser
        driver.quit();
    }

    private static void clickLinkByPartialText(WebDriver driver, String partialLinkText) {
        // Click a link using partialLinkText
        WebElement link = driver.findElement(By.partialLinkText(partialLinkText));
        link.click();
        System.out.println("Clicked link with partial text: " + partialLinkText);
    }

    private static void clickLinkByText(WebDriver driver, String linkText) {
        // Click a link using linkText
        WebElement link = driver.findElement(By.linkText(linkText));
        link.click();
        System.out.println("Clicked link with text: " + linkText);
    }

    private static void findAllLinks(WebDriver driver) {
        // Find all the links on the web page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print the text of each link
        System.out.println("All Links on the Web Page:");
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    }

    private static void clickImageLink(WebDriver driver, String altText) {
        // Click on an image link by its alt text
        WebElement imageLink = driver.findElement(By.xpath("//img[@alt='" + altText + "']/ancestor::a"));
        imageLink.click();
        System.out.println("Clicked on image link with alt text: " + altText);
    }
}
