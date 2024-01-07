import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MagnusTestNGExample {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        driver = new FirefoxDriver();

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
    }

    @Test(priority = 1)
    public void testAssertions() {
        WebElement element = driver.findElement(By.id("exampleElementId"));
        
        // 4. List down the assertions and use them in a test case
        Assert.assertEquals(element.getText(), "Expected Text");

        // Example of a failed assertion
        // Assert.assertEquals(element.getText(), "Incorrect Expected Text");
    }

    @Test(priority = 2, dependsOnMethods = "testAssertions")
    public void testDependentScript() {
        // 6. Make one test script dependent on the other and run both of them
        System.out.println("Dependent Script Executed");
    }

    @Test(priority = 3)
    public void testPriority() {
        // 7. Set priority to all the tests, execute and observe the order of execution
        System.out.println("Priority Test Executed");
    }

    @Test(priority = 4, invocationCount = 3)
    public void testInvocationCount() {
        // 8. How to run the test multiple times using invocationCount
        System.out.println("Invocation Count Test Executed");
    }

    @Test(priority = 5, groups = "parameterizedTest", dataProvider = "data-provider")
    public void testParameterized(String parameter) {
        // 9. Pass parameters to test script
        System.out.println("Parameterized Test Executed with parameter: " + parameter);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"Parameter1"}, {"Parameter2"}};
    }

    @Test(priority = 6, dataProvider = "data-provider")
    public void testDataDrivenFramework(String parameter) {
        // 10. Create data-driven framework using DataProvider
        System.out.println("Data-Driven Framework Test Executed with parameter: " + parameter);
    }

    @Test(priority = 7, groups = "group1")
    public void testGrouping1() {
        // 11. How to group test cases
        System.out.println("Group 1 Test Executed");
    }

    @Test(priority = 8, groups = "group2")
    public void testGrouping2() {
        // 11. How to group test cases
        System.out.println("Group 2 Test Executed");
    }

    @Test(priority = 9)
    public void testParallelExecution1() {
        // 12. Running test cases in parallel
        System.out.println("Parallel Execution Test 1 Executed");
    }

    @Test(priority = 10)
    public void testParallelExecution2() {
        // 12. Running test cases in parallel
        System.out.println("Parallel Execution Test 2 Executed");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

    @AfterMethod
    public void afterMethod() {
        // Example of disabling or ignoring a test from running
        // throw new SkipException("Test Skipped");
    }

    @Parameters({"username", "password"})
    @Test(groups = "parameterizedTest")
    public void testParameterizedFromXML(String username, String password) {
        // 9. Pass parameters to test script from testing.xml
        System.out.println("Parameterized Test from XML - Username: " + username + ", Password: " + password);
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
