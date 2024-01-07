import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumMethodsExample {
    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the website
        driver.get("http://example.com");

        // Perform various actions

        // get()
        String url = "http://example.com";
        driver.get(url);

        // getCurrentUrl()
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // getTitle()
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // getPageSource()
        String pageSource = driver.getPageSource();
        System.out.println("Page Source: " + pageSource);

        // findElement()
        WebElement element = driver.findElement(By.id("elementId"));

        // findElements()
        List<WebElement> elements = driver.findElements(By.className("exampleClass"));

        // getWindowHandle()
        String windowHandle = driver.getWindowHandle();

        // getWindowHandles()
        Set<String> windowHandles = driver.getWindowHandles();

        // switchTo()
        driver.switchTo().window(windowHandle);

        // manage()
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // driver.navigate().to()
        driver.navigate().to("http://example.com");

        // driver.navigate().back()
        driver.navigate().back();

        // driver.navigate().forward()
        driver.navigate().forward();

        // driver.navigate().refresh()
        driver.navigate().refresh();

        // click()
        element.click();

        // sendKeys()
        element.sendKeys("Hello, Selenium!");

        // getAttribute()
        String attributeValue = element.getAttribute("attributeName");

        // getTagName()
        String tagName = element.getTagName();

        // getText()
        String text = element.getText();

        // isDisplayed()
        boolean isDisplayed = element.isDisplayed();

        // isEnabled()
        boolean isEnabled = element.isEnabled();

        // isSelected()
        boolean isSelected = element.isSelected();

        // driver.quit()
        driver.quit();

        // driver.close()
        // Note: Use this if you want to close only the current browser window, not the entire WebDriver instance.
        // driver.close();

        // Thread.sleep()
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // getSize()
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();
        System.out.println("Element Size: Width = " + width + ", Height = " + height);

        // getLocation()
        int xCoordinate = element.getLocation().getX();
        int yCoordinate = element.getLocation().getY();
        System.out.println("Element Location: X = " + xCoordinate + ", Y = " + yCoordinate);
    }
}
