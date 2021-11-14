import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class HelloWebDriver {
    @Test
    public void main() throws InterruptedException {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://pastecode.ru/");
            WebElement inputAuthorNameValues = driver.findElement(By.name("author"));
            WebElement inputTitleValues = driver.findElement(By.name("title"));
            WebElement inputCodeLanguegeValues = driver.findElement(By.name("language"));
            WebElement inputPasteValues = driver.findElement(By.name("code"));
            WebElement pasteValuesBtn = driver.findElement(By.xpath("//*[@id=\"code-submit-container\"]/input"));
            inputAuthorNameValues.sendKeys("KirillPochta");
            Thread.sleep(2000);
            inputCodeLanguegeValues.sendKeys("Bash");
            Thread.sleep(2000);
            inputPasteValues.sendKeys("Hello from WebDriver");
            Thread.sleep(2000);
            inputTitleValues.sendKeys("hellowb");
            Thread.sleep(2000);
            Thread.sleep(2000);
            pasteValuesBtn.click();
            WebElement inputCodeLanguegeValuesComlete = driver.findElement(By.name("language"));
            inputCodeLanguegeValuesComlete.sendKeys("bash");
            Thread.sleep(2000);
            driver.quit();
        }
        catch (Exception e){

        }
    }
}
