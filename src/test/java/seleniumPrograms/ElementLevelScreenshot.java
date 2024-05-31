package seleniumPrograms;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ElementLevelScreenshot {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[1]"));
        File srcFile = element.getScreenshotAs(OutputType.FILE);
        File destFile = new File("filepath\\grocery.png");
        FileUtils.copyFile(srcFile, destFile);
    }
}
