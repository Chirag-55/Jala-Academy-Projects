import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MagnusWebDriverExample {
    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the Magnus application site
        driver.get("http://magnus.jalatechnologies.com/");

        // Perform various actions on the Magnus application site

        // Enter login credentials
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("training@jalaacademy.com");
        passwordField.sendKeys("jobprogram");

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("loginBtn"));
        loginButton.click();

        // Wait for some time (just for demonstration, prefer using explicit or implicit waits)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Example WebDriver methods

        // get()
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // getTitle()
        System.out.println("Page Title: " + driver.getTitle());

        // getPageSource()
        System.out.println("Page Source: " + driver.getPageSource());

        // findElement()
        WebElement exampleElement = driver.findElement(By.id("exampleElementId"));

        // findElements()
        // For example, find all buttons on the page
        driver.findElements(By.tagName("button")).forEach(WebElement::click);

        // getWindowHandle()
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindowHandle);

        // getWindowHandles()
        System.out.println("All Window Handles: " + driver.getWindowHandles());

        // switchTo()
        driver.switchTo().window(mainWindowHandle);

        // manage()
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // driver.navigate().to()
        driver.navigate().to("http://magnus.jalatechnologies.com/");

        // driver.navigate().back()
        driver.navigate().back();

        // driver.navigate().forward()
        driver.navigate().forward();

        // driver.navigate().refresh()
        driver.navigate().refresh();

        // click()
        exampleElement.click();

        // sendKeys()
        exampleElement.sendKeys("Hello, Magnus!");

        // getAttribute()
        String attributeValue = exampleElement.getAttribute("attributeName");

        // getTagName()
        String tagName = exampleElement.getTagName();

        // getText()
        String text = exampleElement.getText();

        // isDisplayed()
        boolean isDisplayed = exampleElement.isDisplayed();

        // isEnabled()
        boolean isEnabled = exampleElement.isEnabled();

        // isSelected()
        boolean isSelected = exampleElement.isSelected();

        // getSize()
        System.out.println("Element Size: " + exampleElement.getSize());

        // getLocation()
        System.out.println("Element Location: " + exampleElement.getLocation());

        // Close the browser
        driver.quit();
    }
}
