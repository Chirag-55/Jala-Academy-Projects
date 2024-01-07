import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class RadioButtonCheckBoxExample {
    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the webpage containing radio buttons and checkboxes
        driver.get("http://magnus.jalatechnologies.com/");

        // 1. Selecting the Radio Button by Label Text / Value
        selectRadioButton(driver, "Option 1");

        // 2. Find out Number of Elements in a Radio Group
        int radioGroupSize = getRadioGroupSize(driver);
        System.out.println("Number of radio buttons in the group: " + radioGroupSize);

        // 3. Find out all radio button values
        List<String> radioButtonValues = getAllRadioButtonValues(driver);
        System.out.println("Radio button values: " + radioButtonValues);

        // 4. How to get the selected radio button label text?
        String selectedRadioButtonText = getSelectedRadioButtonText(driver);
        System.out.println("Selected radio button label text: " + selectedRadioButtonText);

        // 5. Check if Radio Button is selected?
        boolean isRadioButtonSelected = isRadioButtonSelected(driver, "Option 1");
        System.out.println("Is radio button selected? " + isRadioButtonSelected);

        // 6. Check if Radio Button is enabled or disabled?
        boolean isRadioButtonEnabled = isRadioButtonEnabled(driver, "Option 1");
        System.out.println("Is radio button enabled? " + isRadioButtonEnabled);

        // Close the browser
        driver.quit();
    }

    private static void selectRadioButton(WebDriver driver, String labelText) {
        // Locate the radio button by its label text
        WebElement radioButton = driver.findElement(By.xpath("//label[text()='" + labelText + "']/input"));

        // Select the radio button
        radioButton.click();
    }

    private static int getRadioGroupSize(WebDriver driver) {
        // Find all radio buttons in the group
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));

        // Return the number of radio buttons in the group
        return radioButtons.size();
    }

    private static List<String> getAllRadioButtonValues(WebDriver driver) {
        // Find all radio buttons in the group
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));

        // Create a list to store radio button values
        List<String> radioButtonValues = new ArrayList<>();

        // Extract values and add to the list
        for (WebElement radioButton : radioButtons) {
            radioButtonValues.add(radioButton.getAttribute("value"));
        }

        return radioButtonValues;
    }

    private static String getSelectedRadioButtonText(WebDriver driver) {
        // Find the selected radio button in the group
        WebElement selectedRadioButton = driver.findElement(By.cssSelector("input[type='radio']:checked"));

        // Get the label text associated with the selected radio button
        WebElement labelElement = selectedRadioButton.findElement(By.xpath(".."));
        return labelElement.getText();
    }

    private static boolean isRadioButtonSelected(WebDriver driver, String labelText) {
        // Locate the radio button by its label text
        WebElement radioButton = driver.findElement(By.xpath("//label[text()='" + labelText + "']/input"));

        // Check if the radio button is selected
        return radioButton.isSelected();
    }

    private static boolean isRadioButtonEnabled(WebDriver driver, String labelText) {
        // Locate the radio button by its label text
        WebElement radioButton = driver.findElement(By.xpath("//label[text()='" + labelText + "']/input"));

        // Check if the radio button is enabled
        return radioButton.isEnabled();
    }
}
