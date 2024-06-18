package seleniumPrograms;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IterateAndClickUsingForEach {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.guru99.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);
        List<WebElement> listObj = webDriver.findElements(By.tagName("a"));
        listObj.stream().filter(webElement -> webElement.getText().trim().contains("Artificial Intelligence")).findFirst().ifPresent(WebElement::click);
       // listObj.stream().filter(webElement -> webElement.getText().trim().contains("Artificial Intelligence")).findFirst().ifPresentOrElse(WebElement::click,() -> {System.out.println("Element not present");});
    }


}
