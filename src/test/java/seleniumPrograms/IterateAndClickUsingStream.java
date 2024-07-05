package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IterateAndClickUsingStream {

    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.guru99.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    By by = By.tagName("a");
    List<WebElement> listObj = driver.findElements(by);
        listObj.parallelStream().filter(webElement -> webElement.getText().trim().contains("Natural Intelligence")).findFirst().ifPresentOrElse(WebElement::click, () -> {System.out.println("Element not present");});
    }
}
