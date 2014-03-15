import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AskTest {
    @Test
    public void shouldAskGoogleForWebDriver() {
        // Setup chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\DevSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();


        browser.get("http://www.bing.com/");

        WebElement inputField = browser.findElement(By.id("sb_form_q"));
        inputField.sendKeys("Samsung Galaxy Tab 3");

        WebElement searchButton = browser.findElement(By.id("sb_form_go"));
        searchButton.click();

        browser.close();
    }
}
