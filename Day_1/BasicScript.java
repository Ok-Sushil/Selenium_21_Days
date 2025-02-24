import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
