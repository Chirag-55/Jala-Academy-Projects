import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {
    public static void main(String[] args) {
        // Set the path of the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the webpage containing the dropdown
        driver.get("http://magnus.jalatechnologies.com/");

        // Locate the dropdown element by its ID
        WebElement dropdown = driver.findElement(By.id("dropdownId"));

        // Wrap the dropdown element with Select class
        Select select = new Select(dropdown);

        // 1. Print all the options available in the dropdown
        printAllDropdownOptions(select);

        // 2. Print the first selected option from the dropdown
        printFirstSelectedOption(select);

        // 3. Select an option by value from the dropdown
        selectOptionByValue(select, "optionValue");

        // 4. Select an option by visible text from the dropdown
        selectOptionByText(select, "Option Text");

        // 5. Select an option by index from the dropdown
        selectOptionByIndex(select, 2);

        // Close the browser
        driver.quit();
    }

    private static void printAllDropdownOptions(Select select) {
        // Get all options from the dropdown
        List<WebElement> options = select.getOptions();

        // Print each option's text
        System.out.println("All Options in the Dropdown:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    private static void printFirstSelectedOption(Select select) {
        // Get the first selected option from the dropdown
        WebElement firstSelectedOption = select.getFirstSelectedOption();

        // Print the text of the first selected option
        System.out.println("First Selected Option: " + firstSelectedOption.getText());
    }

    private static void selectOptionByValue(Select select, String value) {
        // Select an option by its value
        select.selectByValue(value);

        System.out.println("Option with value '" + value + "' selected.");
    }

    private static void selectOptionByText(Select select, String visibleText) {
        // Select an option by its visible text
        select.selectByVisibleText(visibleText);

        System.out.println("Option with text '" + visibleText + "' selected.");
    }

    private static void selectOptionByIndex(Select select, int index) {
        // Select an option by its index
        select.selectByIndex(index);

        System.out.println("Option at index " + index + " selected.");
    }
}
