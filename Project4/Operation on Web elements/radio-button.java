import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExamples {
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

        // Navigate to the radio button page
        driver.findElement(By.linkText("Radio Button")).click();

        // Example Radio Button interactions:

        // 1. Selecting the Radio Button by Label Text / value
        WebElement radioButtonByLabelText = driver.findElement(By.xpath("//label[text()='Option 1']/input"));
        radioButtonByLabelText.click();

        // 2. Find out the number of elements in a radio group
        int radioGroupSize = driver.findElements(By.name("radioGroup")).size();
        System.out.println("Number of Radio Buttons in the Group: " + radioGroupSize);

        // 3. Find out all radio button values
        System.out.println("Values of Radio Buttons in the Group:");
        for (WebElement radio : driver.findElements(By.name("radioGroup"))) {
            System.out.println(radio.getAttribute("value"));
        }

        // 4. How to get the selected radio button label text?
        WebElement selectedRadio = driver.findElement(By.xpath("//input[@name='radioGroup' and @checked]/following-sibling::label"));
        System.out.println("Selected Radio Button Label Text: " + selectedRadio.getText());

        // 5. Check if Radio Button is selected?
        WebElement radioToCheck = driver.findElement(By.xpath("//input[@name='radioGroup'][@value='Option 2']"));
        System.out.println("Is Radio Button selected? " + radioToCheck.isSelected());

        // 6. Check if Radio Button is enabled or disabled?
        WebElement radioToCheck2 = driver.findElement(By.xpath("//input[@name='radioGroup'][@value='Option 3']"));
        System.out.println("Is Radio Button enabled? " + radioToCheck2.isEnabled());

        // Close the browser
        driver.quit();
    }
}
