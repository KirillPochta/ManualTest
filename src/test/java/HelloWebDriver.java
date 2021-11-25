import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWebDriver {
    @Test
    public void main() throws InterruptedException {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Set implicit wait:
            //wait for WebElement
            driver.manage().timeouts().implicitlyWait(5000,
                    TimeUnit.MILLISECONDS);
            //wait for loading page
            driver.manage().timeouts().pageLoadTimeout(10000,
                    TimeUnit.MILLISECONDS);
            //wait for an asynchronous script to finish execution
            driver.manage().timeouts().setScriptTimeout(5000,
                    TimeUnit.MILLISECONDS);
            driver.get("https://pastecode.ru/");
            WebElement inputAuthorNameValues = driver.findElement(By.name("author"));
            WebElement inputTitleValues = driver.findElement(By.name("title"));
            WebElement inputCodeLanguegeValues = driver.findElement(By.name("language"));
            WebElement inputPasteValues = driver.findElement(By.name("code"));
            WebElement pasteValuesBtn = driver.findElement(By.xpath("//*[@id=\"code-submit-container\"]/input"));
            inputAuthorNameValues.sendKeys("KirillPochta");
            inputCodeLanguegeValues.sendKeys("Bash");
            inputPasteValues.sendKeys("Hello from WebDriver");
            inputTitleValues.sendKeys("hellowb");
            pasteValuesBtn.click();
            WebElement inputCodeLanguegeValuesComlete = driver.findElement(By.name("language"));
            inputCodeLanguegeValuesComlete.sendKeys("bash");
            driver.quit();
        }
        catch (Exception e){  Logger logger = Logger.getLogger(HelloWebDriver.class.getName());
            logger.log(Level.INFO,e.getMessage());
        }
    }
}
