import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MagnusSeleniumScenariosExample {
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

        // 1. Write a test case to capture the screenshots with WebDriver
        captureScreenshot(driver, "loginScreenshot");

        // 2. Click on an element which is in iFrame
        WebElement iframeElement = driver.findElement(By.id("iframeId"));
        driver.switchTo().frame(iframeElement);
        WebElement elementInFrame = driver.findElement(By.id("elementInFrameId"));
        elementInFrame.click();
        driver.switchTo().defaultContent();

        // 3. Find out the broken links on a web page
        findBrokenLinks(driver);

        // 4. Implicit and Explicit wait commands
        implicitWaitExample(driver);
        explicitWaitExample(driver);

        // 5. Action class with the following operations
        Actions actions = new Actions(driver);

        // Keyboard key press event
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        // Pressing enter button on the keyboard
        actions.sendKeys(Keys.ENTER).perform();

        // ClickAndHold event, Drag and Drop
        WebElement sourceElement = driver.findElement(By.id("sourceElementId"));
        WebElement targetElement = driver.findElement(By.id("targetElementId"));
        actions.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();

        // MoveToElement, Mouse Hover Event
        WebElement hoverElement = driver.findElement(By.id("hoverElementId"));
        actions.moveToElement(hoverElement).perform();

        // Double Click event
        WebElement doubleClickElement = driver.findElement(By.id("doubleClickElementId"));
        actions.doubleClick(doubleClickElement).perform();

        // 6. Web Table operations
        int rowCount = getRowCountOfWebTable(driver, By.id("webTableId"));
        System.out.println("Row Count: " + rowCount);

        String cellData = getDataFromSpecificCell(driver, By.id("webTableId"), 2, 3);
        System.out.println("Data from Specific Cell: " + cellData);

        // Dynamic web table handling
        dynamicWebTableHandling(driver);

        // 7. Handling Ajax Auto suggestion
        WebElement ajaxTextbox = driver.findElement(By.id("ajaxTextboxId"));
        ajaxTextbox.sendKeys("Selenium");
        waitForAjax(driver);

        // 8. Select a specific date from a calendar
        WebElement dateTextbox = driver.findElement(By.id("dateTextboxId"));
        dateTextbox.click();
        selectDateFromCalendar(driver, "12/31/2023");

        // 9. Cookies operations-Adding and Deleting cookies, Profile creation for browsers
        performCookiesOperations(driver);

        // Close the browser
        driver.quit();
    }

    private static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("path/to/screenshots/" + screenshotName + ".png");
        try {
            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findBrokenLinks(WebDriver driver) {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.connect();
                if (connection.getResponseCode() != 200) {
                    System.out.println("Broken Link: " + url);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void implicitWaitExample(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private static void explicitWaitExample(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("exampleElementId")));
        element.click();
    }

    private static int getRowCountOfWebTable(WebDriver driver, By tableLocator) {
        WebElement table = driver.findElement(tableLocator);
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        return rows.size();
    }

    private static String getDataFromSpecificCell(WebDriver driver, By tableLocator, int row, int column) {
        WebElement table = driver.findElement(tableLocator);
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        WebElement specificRow = rows.get(row - 1);
        List<WebElement> cells = specificRow.findElements(By.tagName("td"));
        WebElement specificCell = cells.get(column - 1);
        return specificCell.getText();
    }

    private static void dynamicWebTableHandling(WebDriver driver) {
        // Implement dynamic web table handling logic here
    }

    private static void waitForAjax(WebDriver driver
