import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MagnusAlertWindowFrameExample {
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

        // Wait for some time (just for demonstration, prefer using explicit or implicit waits)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Handle various alerts, windows, frames, and popups

        // 1. Capturing the alert message using getText()
        WebElement alertButton = driver.findElement(By.id("alertBtn"));
        alertButton.click();
        String alertMessage = getAlertText(driver);
        System.out.println("Alert Message: " + alertMessage);
        acceptAlert(driver);

        // 2. Prompt Alert with Text Box to enter the text
        WebElement promptButton = driver.findElement(By.id("promptBtn"));
        promptButton.click();
        enterTextInPromptAlert(driver, "Selenium");
        acceptAlert(driver);

        // 3. Confirmation Alert with Ok and Cancel buttons
        WebElement confirmButton = driver.findElement(By.id("confirmBtn"));
        confirmButton.click();
        // acceptAlert(driver); // Click OK
        dismissAlert(driver); // Click Cancel

        // 6. Handle single window using driver.getWindowHandle()
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindowHandle);

        // 7. Handle multiple windows using driver.getWindowHandles()
        WebElement openNewWindowButton = driver.findElement(By.id("openNewWindowBtn"));
        openNewWindowButton.click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + windowHandles);

        // 8. Switch to window using driver.switchTo().window()
        switchToWindow(driver, mainWindowHandle);

        // 9. Switch to frame using driver.switchTo().frame()
        WebElement frameElement = driver.findElement(By.id("frameId"));
        driver.switchTo().frame(frameElement);
        // Perform actions inside the frame
        // To switch back to the main content, use driver.switchTo().defaultContent()

        // 10. Switch to popup using driver.switchTo.alert()
        WebElement popupButton = driver.findElement(By.id("popupBtn"));
        popupButton.click();
        switchToPopupWindow(driver);

        // Close the browser
        driver.quit();
    }

    private static String getAlertText(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        return alertText;
    }

    private static void acceptAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    private static void dismissAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    private static void enterTextInPromptAlert(WebDriver driver, String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    private static void switchToWindow(WebDriver driver, String windowHandle) {
        driver.switchTo().window(windowHandle);
    }

    private static void switchToPopupWindow(WebDriver driver) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
}
